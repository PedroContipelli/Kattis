import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class dungeon {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
	{
	int l = scan.nextInt();
	int r = scan.nextInt();
	int c = scan.nextInt();
	
	if (l == 0 && r == 0 && c == 0)
		break;
	
	char[][][] map = new char[l][r][c];
	int[][][] d = new int[l][r][c];
	
	for (int i = 0; i < l; i++)
		for (int j = 0; j < r; j++)
			{
			map[i][j] = scan.next().toCharArray();
			Arrays.fill(d[i][j], -1);
			}
	
	Point start = new Point(-1 , -1 , -1);
	Point end = new Point(-1 , -1 , -1);
	
	for (int i = 0; i < l; i++)
		for (int j = 0; j < r; j++)
			for (int k = 0; k < c; k++)
				if (map[i][j][k] == 'S')
					{
					start = new Point(i , j , k);
					d[i][j][k] = 0;
					}
				else if (map[i][j][k] == 'E')
					{
					end = new Point(i , j , k);
					map[i][j][k] = '.';
					}
	
	ArrayList<Point> queue = new ArrayList<>();
	queue.add(start);
	
	while (!queue.isEmpty())
		{
		Point a = queue.remove(0);
		
		// UP
		if (a.l - 1 >= 0 && map[a.l - 1][a.r][a.c] == '.' && d[a.l - 1][a.r][a.c] == -1)
			{
			d[a.l - 1][a.r][a.c] = d[a.l][a.r][a.c] + 1;
			queue.add(new Point(a.l - 1 , a.r , a.c));
			}
		
		// DOWN
		if (a.l + 1 < l && map[a.l + 1][a.r][a.c] == '.' && d[a.l + 1][a.r][a.c] == -1)
			{
			d[a.l + 1][a.r][a.c] = d[a.l][a.r][a.c] + 1;
			queue.add(new Point(a.l + 1 , a.r , a.c));
			}
		
		// NORTH
		if (a.r - 1 >= 0 && map[a.l][a.r - 1][a.c] == '.' && d[a.l][a.r - 1][a.c] == -1)
			{
			d[a.l][a.r - 1][a.c] = d[a.l][a.r][a.c] + 1;
			queue.add(new Point(a.l, a.r - 1 , a.c));
			}
			
		// SOUTH
		if (a.r + 1 < r && map[a.l][a.r + 1][a.c] == '.' && d[a.l][a.r + 1][a.c] == -1)
			{
			d[a.l][a.r + 1][a.c] = d[a.l][a.r][a.c] + 1;
			queue.add(new Point(a.l, a.r + 1 , a.c));
			}
			
		// LEFT
		if (a.c - 1 >= 0 && map[a.l][a.r][a.c - 1] == '.' && d[a.l][a.r][a.c - 1] == -1)
			{
			d[a.l][a.r][a.c - 1] = d[a.l][a.r][a.c] + 1;
			queue.add(new Point(a.l, a.r , a.c - 1));
			}
			
		// RIGHT
		if (a.c + 1 < c && map[a.l][a.r][a.c + 1] == '.' && d[a.l][a.r][a.c + 1] == -1)
			{
			d[a.l][a.r][a.c + 1] = d[a.l][a.r][a.c] + 1;
			queue.add(new Point(a.l, a.r , a.c + 1));
			}
		}
	
	String msg = "Trapped!";
	String msg2 = "Escaped in " + d[end.l][end.r][end.c] + " minute(s).";
	
	System.out.println(msg2.contains("-1") ? msg : msg2);
	}

scan.close();
	}
}

class Point {
int l , r , c;
	
public Point(int a , int b , int c) {
	this.l = a;
	this.r = b;
	this.c = c;
}

}