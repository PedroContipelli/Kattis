import java.util.Scanner;
public class misa {
	
public static int shakes(int r , int c , char[][] misa) {
	int count = 0;
	
	for (int i = -1; i <= 1; i++)
		for (int j = -1; j <= 1; j++)
			if (r + i >= 0 && r + i < misa.length && c + j >= 0 && c + j < misa[0].length && misa[r + i][c + j] == 'o' && !(i == 0 && j == 0))
				count++;
	
	return count;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int R = scan.nextInt();
int C = scan.nextInt();
int totalShakes = 0;

char[][] misa = new char[R][C];

for (int i = 0; i < R; i++)
	{
	String str = scan.next();
	
	for (int j = 0; j < C; j++)
		misa[i][j] = str.charAt(j);
	}

int rowSit = -1;
int colSit = -1;
int maxShakes = 0;

for (int i = 0; i < R; i++)
	for (int j = 0; j < C; j++)
		if (misa[i][j] == '.' && shakes(i , j , misa) > maxShakes)
			{
			rowSit = i;
			colSit = j;
			maxShakes = shakes(i , j , misa);
			}
			
if (rowSit != -1 && colSit != -1)
	misa[rowSit][colSit] = 'o';

for (int i = 0; i < R; i++)
	for (int j = 0; j < C; j++)
		if (misa[i][j] == 'o')
			totalShakes += shakes(i , j , misa);

System.out.println(totalShakes / 2);

scan.close();
	}
}