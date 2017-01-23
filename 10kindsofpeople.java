import java.util.ArrayList;
import java.util.Scanner;
public class 10kindsofpeople {

static int[] R = {1 , -1 , 0 , 0};
static int[] C = {0 , 0 , 1 , -1};

public static void bfs(Point2 start , char[][] map , int[][] groups , int fill) {

ArrayList<Point2> queue = new ArrayList<>();
queue.add(start);
groups[start.r][start.c] = fill;

while (!queue.isEmpty())
	{
	Point2 curr = queue.remove(0);
	int r = curr.r;
	int c = curr.c;
	
	for (int i = 0; i < 4; i++)
		{
		int tryR = r + R[i];
		int tryC = c + C[i];

		if (tryR >= 0 && tryR < map.length && tryC >= 0 && tryC < map[0].length)
			if (map[tryR][tryC] == map[r][c] && groups[tryR][tryC] != fill)
				{
				groups[tryR][tryC] = fill;
				queue.add(new Point2(tryR , tryC));
				}
		}
	}

}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int rows = scan.nextInt();
int columns = scan.nextInt();

char[][] map = new char[rows][columns];

for (int i = 0; i < rows; i++)
	map[i] = scan.next().toCharArray();

int[][] groups = new int[map.length][map[0].length];
int fill = 2;

for (int i = 0; i < rows; i++)
	for (int j = 0; j < columns; j++)
		if (groups[i][j] == 0)
			{
			bfs(new Point2(i , j) , map , groups , fill);
			fill++;
			}

int queries = scan.nextInt();

for (int i = 0; i < queries; i++)
	{
	int r1 = scan.nextInt() - 1;
	int c1 = scan.nextInt() - 1;
	int r2 = scan.nextInt() - 1;
	int c2 = scan.nextInt() - 1;
	
	if (groups[r1][c1] == groups[r2][c2])
		System.out.println(map[r1][c1] == '1' ? "decimal" : "binary");
	else
		System.out.println("neither");
	}

scan.close();
	}
}

class Point2 {
	
int r , c;

public Point2 (int a , int b) {
	r = a;
	c = b;
}

}
