import java.util.Scanner;
public class countingstars {

static int r = 0;
static int c = 0;
static int count = 0;
static char[][] star;
static boolean[][] used;

public static void fill(int i , int j) {
	if (i == 0 || i == r + 1 || j == 0 || j == c + 1)
		return;
	
	used[i][j] = true;
	
	if (star[i + 1][j] == '-' && !used[i + 1][j])
		fill (i + 1 , j);
	
	if (star[i - 1][j] == '-' && !used[i - 1][j])
		fill (i - 1 , j);
	
	if (star[i][j + 1] == '-' && !used[i][j + 1])
		fill (i , j + 1);
	
	if (star[i][j - 1] == '-' && !used[i][j - 1])
		fill (i , j - 1);
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int caze = 1;

while (scan.hasNext())
	{
	r = scan.nextInt();
	c = scan.nextInt();
	star = new char[r + 2][c + 2];
	used = new boolean[r + 2][c + 2];
	
	for (int i = 1; i < r + 1; i++)
		{
		String str = scan.next();
		for (int j = 1; j < c + 1; j++)
			star[i][j] = str.charAt(j - 1);
		}
	
	count = 0;
	
	for (int i = 1; i < r + 1; i++)
		for (int j = 1; j < c + 1; j++)
			{
			if (star[i][j] == '-')
				{
				if (!used[i + 1][j] && !used[i - 1][j] && !used[i][j + 1] && !used[i][j - 1])
					{
					count++;
					fill(i , j);
					}
				}
			}
	
	System.out.println("Case " + caze + ": " + count);
	caze++;
	}

scan.close();
	}
}