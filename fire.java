import java.util.*;
public class fire {
static int[] R = {0 , 0 , -1 , 1};
static int[] C = {-1 , 1 , 0 , 0};

public static void print(char[][] map) {
    
    for (int i = 0; i < map.length; i++)
        System.out.println(new String(map[i]));
    
    System.out.println();
}

public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int cases = scan.getInt();

big:
while (cases --> 0)
    {
    int cols = scan.getInt();
    int rows = scan.getInt();
    
    char[][] map = new char[rows][cols];
    int[][] dist = new int[rows][cols];
    
    for (int i = 0; i < rows; i++)
        {
        map[i] = scan.getWord().toCharArray();
        Arrays.fill(dist[i] , -1);
        }
    
    FirePoint start = new FirePoint(0 , 0);
    ArrayDeque<FirePoint> queue2 = new ArrayDeque<>();
    
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < cols; j++)
            if (map[i][j] == '@')
                {
                start = new FirePoint(i , j);
                map[i][j] = '.';
                }
            else if (map[i][j] == '*')
                queue2.add(new FirePoint(i , j));
    
    dist[start.r][start.c] = 0;
    ArrayDeque<FirePoint> queue = new ArrayDeque<>();
    queue.add(start);
    int branches = 1;
    int branches2 = queue2.size();
    
    while (!queue.isEmpty())
        {
        branches2 = queue2.size();
        
        while (branches2 > 0)
            {
            FirePoint current = queue2.remove();
            
            int i = current.r;
            int j = current.c;
            
            for (int x = 0; x < 4; x++)
                {
                int newR = i + R[x];
                int newC = j + C[x];
                
                if (newR >= 0 && newR < rows && newC >= 0 && newC < cols && map[newR][newC] == '.')
                    {
                    map[newR][newC] = '*';
                    queue2.add(new FirePoint(newR , newC));
                    }
                }
                
            branches2--;
            }
                    
        int newBranches = 0;
        while (branches > 0)
            {
            FirePoint current = queue.remove();
            int r = current.r;
            int c = current.c;
            
            if ((r == rows - 1 || r == 0 || c == cols - 1 || c == 0))
                {
                System.out.println(dist[r][c] + 1);
                continue big;
                }
            
            for (int i = 0; i < 4; i++)
                {
                int newR = r + R[i];
                int newC = c + C[i];
                
                if (newR >= 0 && newR < rows && newC >= 0 && newC < cols)
                    if (dist[newR][newC] == -1 && map[newR][newC] == '.')
                        {
                        queue.add(new FirePoint(newR , newC));
                        dist[newR][newC] = dist[r][c] + 1;
                        newBranches++;
                        
                        if ((newR == rows - 1 || newR == 0 || newC == cols - 1 || newC == 0))
                            {
                            System.out.println(dist[newR][newC] + 1);
                            continue big;
                            }
                        }
                }
            
            branches--;
            }
        
        branches += newBranches;
        }
    
    System.out.println("IMPOSSIBLE");
    }

scan.close();
    }
}

class FirePoint {
    
int r , c;

public FirePoint(int a , int b) {
    r = a;
    c = b;
}

}