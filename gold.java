import java.util.ArrayList;
import java.util.Scanner;
public class gold {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int c = scan.nextInt();
int r = scan.nextInt();

int gold = 0;

char[][] map = new char[r][c];
boolean[][] visit = new boolean[r][c];

for (int i = 0; i < r; i++)
	map[i] = scan.next().toCharArray();

Pos start = new Pos(-1 , -1);

for (int i = 0; i < r; i++)
	for (int j = 0; j < c; j++)
		if (map[i][j] == 'P')
			start = new Pos(i , j);

ArrayList<Pos> queue = new ArrayList<>();
queue.add(start);
visit[start.r][start.c] = true;

while (!queue.isEmpty())
	{
	Pos pos = queue.remove(0);
	
	if (map[pos.r][pos.c] == 'G')
		gold++;
	
	if (map[pos.r + 1][pos.c] == 'T' || map[pos.r - 1][pos.c] == 'T' || map[pos.r][pos.c + 1] == 'T' || map[pos.r][pos.c - 1] == 'T')
		continue;
	
	if ((map[pos.r + 1][pos.c] == '.' || map[pos.r + 1][pos.c] == 'G') && !visit[pos.r + 1][pos.c])
		{
		queue.add(new Pos(pos.r + 1 , pos.c));
		visit[pos.r + 1][pos.c] = true;
		}
	
	if ((map[pos.r - 1][pos.c] == '.' || map[pos.r - 1][pos.c] == 'G') && !visit[pos.r - 1][pos.c])
		{
		queue.add(new Pos(pos.r - 1 , pos.c));
		visit[pos.r - 1][pos.c] = true;
		}
	
	if ((map[pos.r][pos.c + 1] == '.' || map[pos.r][pos.c + 1] == 'G') && !visit[pos.r][pos.c + 1])
		{
		queue.add(new Pos(pos.r , pos.c + 1));
		visit[pos.r][pos.c + 1] = true;
		}
	
	if ((map[pos.r][pos.c - 1] == '.' || map[pos.r][pos.c - 1] == 'G') && !visit[pos.r][pos.c - 1])
		{
		queue.add(new Pos(pos.r , pos.c - 1));
		visit[pos.r][pos.c - 1] = true;
		}
	}

System.out.println(gold);

scan.close();
	}
}

class Pos {
	
int r , c;

public Pos(int r , int c) {
	this.r = r;
	this.c = c;
}

}