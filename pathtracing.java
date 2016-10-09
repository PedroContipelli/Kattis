import java.util.Scanner;
import java.util.ArrayList;
public class pathtracing {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

ArrayList<String> moves = new ArrayList<>();

/*
while (true)
    {
    String str = scan.next();
    if (str.equals("0"))
        break;
    else
        moves.add(str); 
    }
*/

while (scan.hasNext())
    moves.add(scan.next()); 

int row = 500;
int col = 500;

int maxRow = 500;
int minRow = 500;
int maxCol = 500;
int minCol = 500;

char[][] path = new char[1001][1001];
path[500][500] = 'S';

for (int i = 0; i < moves.size(); i++)
    {
    if (moves.get(i).equals("up"))
        row--;
    else if (moves.get(i).equals("down"))
        row++;
    else if (moves.get(i).equals("left"))
        col--;
    else
        col++;
    
    if (row > maxRow)
        maxRow = row;
    else if (row < minRow)
        minRow = row;
    
    if (col > maxCol)
        maxCol = col;
    else if (col < minCol)
        minCol = col;
    
    if (path[row][col] != 'S')
        path[row][col] = '*';
    }

path[row][col] = 'E';

/*
 * maxRow = 502
 * minRow = 499
 * maxCol = 500
 * minCol = 497
 */

for (int i = minRow; i <= maxRow; i++)
    for (int j = minCol; j <= maxCol; j++)
        if (path[i][j] == (char)0)
            path[i][j] = ' ';

for (int i = minRow - 1; i <= maxRow + 1; i++)
    for (int j = minCol - 1; j <= maxCol + 1; j++)
        if (path[i][j] == (char)0)
            path[i][j] = '#';

for (int i = minRow - 1; i <= maxRow + 1; i++)
    {
    for (int j = minCol - 1; j <= maxCol + 1; j++)
        System.out.print(path[i][j]);
    
    System.out.println();
    }

scan.close();
    }
}