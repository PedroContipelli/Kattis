import java.util.*;
public class showroom {

static int[] R = {-1 , 1 , 0 , 0};
static int[] C = {0 , 0 , -1 , 1};

public static boolean inBounds(int r , int c , int maxR , int maxC) {
    return r >= 0 && r < maxR && c >= 0 && c < maxC;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int rows = scan.nextInt();
int columns = scan.nextInt();

char[][] room = new char[rows][columns];
int[][] dist = new int[rows][columns];

for (int i = 0; i < room.length; i++)
    {
    room[i] = scan.next().toCharArray();
    Arrays.fill(dist[i] , -1);
    }

int startX = scan.nextInt() - 1;
int startY = scan.nextInt() - 1;

dist[startX][startY] = 0;
ShowPoint start = new ShowPoint(startX , startY);
LinkedList<ShowPoint> queue = new LinkedList<>();
queue.add(start);

while(!queue.isEmpty())
    {
    ShowPoint vis = queue.remove();
    
    for (int i = 0; i < 4; i++)
        if (inBounds(vis.r + R[i] , vis.c + C[i] , rows , columns))
            if (dist[vis.r + R[i]][vis.c + C[i]] == -1)
                {
                if (room[vis.r + R[i]][vis.c + C[i]] == 'c')
                    {
                    queue.add(new ShowPoint(vis.r + R[i] , vis.c + C[i]));
                    dist[vis.r + R[i]][vis.c + C[i]] = dist[vis.r][vis.c] + 1;
                    }
                else if (room[vis.r + R[i]][vis.c + C[i]] == 'D')
                    {
                    queue.addFirst(new ShowPoint(vis.r + R[i] , vis.c + C[i]));
                    dist[vis.r + R[i]][vis.c + C[i]] = dist[vis.r][vis.c];
                    }
                }
    }

int min = Integer.MAX_VALUE;

for (int i = 0; i < rows; i++)
    {
    min = Math.min(dist[i][0] == -1 ? Integer.MAX_VALUE : dist[i][0] , min);
    min = Math.min(dist[i][columns - 1] == -1 ? Integer.MAX_VALUE : dist[i][columns - 1] , min);
    }

for (int i = 0; i < columns; i++)
    {
    min = Math.min(dist[0][i] == -1 ? Integer.MAX_VALUE : dist[0][i] , min);
    min = Math.min(dist[rows - 1][i] == -1 ? Integer.MAX_VALUE : dist[rows - 1][i] , min);
    }

System.out.println(min + 1);

scan.close();
    }
}

class ShowPoint {
    
int r , c;

public ShowPoint(int a , int b) {
    r = a;
    c = b;
}

}