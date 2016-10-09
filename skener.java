import java.util.Scanner;
public class skener {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int R = scan.nextInt();
int C = scan.nextInt();

int Vertical = scan.nextInt();
int Horizontal = scan.nextInt();

String[][] in = new String[R][C];

for (int r = 0; r < R; r++)
	{
	String row = scan.next();
	
	for (int c = 0; c < C; c++)
		in[r][c] = row.substring(c, c + 1);
	}

for (int i = 0; i < in.length; i++)
	{
	for (int y = 0; y < Vertical; y++)
		{
		for (int j = 0; j < in[0].length; j++)
			{
			for (int x = 0; x < Horizontal; x++)
			System.out.print(in[i][j]);
			}
		
		System.out.println();
		}
	}

scan.close();
}
}
