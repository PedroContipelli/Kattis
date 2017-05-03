import java.util.*;
public class grid {
    
static int[] A = {0 , 0 , -1 , 1};
static int[] B = {-1 , 1 , 0 , 0};
static int[][] dist;
static int[][] grid;

public static boolean inBounds(int r , int c , int R , int C) {
    return r >= 0 && r < R && c >= 0 && c < C;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int R = scan.nextInt();
int C = scan.nextInt();

dist = new int[R][C];
grid = new int[R][C];

for (int i = 0; i < R; i++)
    {
    String line = scan.next();
    
    for (int j = 0; j < C; j++)
        {
        grid[i][j] = Integer.parseInt(line.substring(j , j + 1));
        dist[i][j] = -1;
        }
    }

GridPoint start = new GridPoint(0 , 0);
ArrayList<GridPoint> queue = new ArrayList<>();
queue.add(start);
dist[0][0] = 0;

while (!queue.isEmpty())
    {
    GridPoint current = queue.remove(0);
    int r = current.r;
    int c = current.c;
    
    for (int i = 0; i < 4; i++)
        {
        if (inBounds(r + grid[r][c]*A[i] , c + grid[r][c]*B[i] , R , C))
            if (dist[r + grid[r][c]*A[i]][c + grid[r][c]*B[i]] == -1)
                {
                queue.add(new GridPoint(r + grid[r][c]*A[i] , c + grid[r][c]*B[i]));
                dist[r + grid[r][c]*A[i]][c + grid[r][c]*B[i]] = dist[r][c] + 1;
                }
        }
    }

System.out.println(dist[R - 1][C - 1]);

scan.close();
    }
}

class GridPoint {
    
int r , c;

public GridPoint(int a , int b) {
    r = a;
    c = b;
}

}