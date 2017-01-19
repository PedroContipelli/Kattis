import java.util.*;
public class a10kindsofpeople {

static char[][] board;
static int[][] parts;

public static void fill(Point start , char bin , int x) {
    
    ArrayDeque<Point> queue = new ArrayDeque<Point>(1000 * 1000);
    queue.add(start);
    parts[start.r][start.c] = x;
    
    while(!queue.isEmpty())
        {
        Point P = queue.pollLast();
        int r = P.r;
        int c = P.c;
        
        // NORTH
        if (r - 1 >= 0 && board[r - 1][c] == bin && parts[r - 1][c] == 0)
            {
            queue.add(new Point(r - 1 , c));
            parts[r - 1][c] = x;
            }
                
        // SOUTH
        if (r + 1 < board.length && board[r + 1][c] == bin && parts[r + 1][c] == 0)
            {
            queue.add(new Point(r + 1 , c));
            parts[r + 1][c] = x;
            }
        
        // EAST
        if (c + 1 < board[0].length && board[r][c + 1] == bin && parts[r][c + 1] == 0)
            {
            queue.add(new Point(r , c + 1));
            parts[r][c + 1] = x;
            }
                
        // WEST
        if (c - 1 >= 0 && board[r][c - 1] == bin && parts[r][c - 1] == 0)
            {
            queue.add(new Point(r , c - 1));
            parts[r][c - 1] = x;
            }
        }
}

public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int rows = scan.getInt();
int columns = scan.getInt();

board = new char[rows][columns];
parts = new int [rows][columns];

for (int i = 0; i < rows; i++)
    board[i] = scan.getWord().toCharArray();

int x = 10;

for (int r = 0; r < parts.length; r++)
    for (int c = 0; c < parts[0].length; c++)
        {
        if (parts[r][c] == 0)
            fill(new Point(r , c) , board[r][c] , x);
        
        x++;
        }

int queries = scan.getInt();

for (int i = 0; i < queries; i++)
    {
    Point start = new Point(scan.getInt() - 1 , scan.getInt() - 1);
    Point end   = new Point(scan.getInt() - 1 , scan.getInt() - 1);
    
    if (parts[start.r][start.c] == parts[end.r][end.c])
        System.out.println(board[start.r][start.c] == '0' ? "binary" : "decimal");
    else
        System.out.println("neither");
    }
scan.close();
    }
}

class Point {
    
int r , c;

public Point(int a , int b) {
    this.r = a;
    this.c = b;
}

}