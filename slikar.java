import java.util.*;
public class slikar {
static int[] R = {0 , 0 , -1 , 1};
static int[] C = {-1 , 1 , 0 , 0};

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int rows = scan.nextInt();
int cols = scan.nextInt();

char[][] map = new char[rows][cols];
int[][] dist = new int[rows][cols];

for (int i = 0; i < rows; i++)
    {
    map[i] = scan.next().toCharArray();
    Arrays.fill(dist[i] , -1);
    }

SlikarPoint start = new SlikarPoint(0 , 0);
SlikarPoint end = new SlikarPoint(0 , 0);

for (int i = 0; i < rows; i++)
    for (int j = 0; j < cols; j++)
        if (map[i][j] == 'S')
            start = new SlikarPoint(i , j);
        else if (map[i][j] == 'D')
            end = new SlikarPoint(i , j);

dist[start.r][start.c] = 0;
map[end.r][end.c] = '.';
LinkedList<SlikarPoint> queue = new LinkedList<>();
queue.add(start);
int branches = 1;

while (!queue.isEmpty())
    {
    boolean[][] water = new boolean[rows][cols];
    
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < cols; j++)
            if (map[i][j] == '*' && !water[i][j])
                for (int x = 0; x < 4; x++)
                {
                int newR = i + R[x];
                int newC = j + C[x];
                
                if (newR >= 0 && newR < rows && newC >= 0 && newC < cols && map[newR][newC] == '.' && !(end.r == newR && end.c == newC))
                    {
                    water[newR][newC] = true;
                    map[newR][newC] = '*';
                    }
                }
                
    int newBranches = 0;
    while (branches > 0)
        {
        SlikarPoint current = queue.remove();
        int r = current.r;
        int c = current.c;
        
        for (int i = 0; i < 4; i++)
            {
            int newR = r + R[i];
            int newC = c + C[i];
            
            if (newR >= 0 && newR < rows && newC >= 0 && newC < cols)
                if (dist[newR][newC] == -1 && map[newR][newC] == '.')
                    {
                    queue.add(new SlikarPoint(newR , newC));
                    dist[newR][newC] = dist[r][c] + 1;
                    newBranches++;
                    }
            }
        
        branches--;
        }
    
    branches += newBranches;
    }

System.out.println(dist[end.r][end.c] == -1 ? "KAKTUS" : dist[end.r][end.c]);

scan.close();
    }
}

class SlikarPoint {
    
int r , c;

public SlikarPoint(int a , int b) {
    r = a;
    c = b;
}

}