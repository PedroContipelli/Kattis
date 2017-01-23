import java.util.*;
public class 10kindsofpeopleNAIVE {

// This solution will give you TLE
	
static int[] R = {1 , -1 , 0 , 0};
static int[] C = {0 , 0 , 1 , -1};

public static boolean bfs(Point1 start , Point1 end , char[][] map) {

boolean[][] visited = new boolean[map.length][map[0].length];

ArrayList<Point1> queue = new ArrayList<>();
queue.add(start);
visited[start.r][start.c] = true;

while (!queue.isEmpty())
	{
	Point1 curr = queue.remove(0);
	int r = curr.r;
	int c = curr.c;
	
	for (int i = 0; i < 4; i++)
		{
		int tryR = r + R[i];
		int tryC = c + C[i];

		if (tryR >= 0 && tryR < map.length && tryC >= 0 && tryC < map[0].length)
			if (map[tryR][tryC] == map[r][c] && !visited[tryR][tryC])
				{
				visited[tryR][tryC] = true;
				queue.add(new Point1(tryR , tryC));
				}
		}
	}

return visited[end.r][end.c];
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int rows = scan.nextInt();
int columns = scan.nextInt();

char[][] map = new char[rows][columns];

for (int i = 0; i < rows; i++)
	map[i] = scan.next().toCharArray();

int queries = scan.nextInt();

for (int i = 0; i < queries; i++)
	{
	Point1 start = new Point1(scan.nextInt() - 1 , scan.nextInt() - 1);
	Point1 end   = new Point1(scan.nextInt() - 1 , scan.nextInt() - 1);
	
	if (bfs(start , end , map))
		System.out.println( map[start.r][start.c] == '1' ? "decimal" : "binary");
	else
		System.out.println("neither");
	}
scan.close();
	}
}

class Point1 {
	
int r , c;

public Point1 (int a , int b) {
	r = a;
	c = b;
}

}
