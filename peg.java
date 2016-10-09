import java.util.Scanner;
public class peg {
	
public static int moves(int r , int c , char[][] nums) {
	int move = 0;
	if (nums[r][c] == '.')
		return 0;
	if (nums[r + 1][c] == 'o' && nums[r + 2][c] == '.')
		move++;
	if (nums[r - 1][c] == 'o' && nums[r - 2][c] == '.')
		move++;
	if (nums[r][c + 1] == 'o' && nums[r][c + 2] == '.')
		move++;
	if (nums[r][c - 1] == 'o' && nums[r][c - 2] == '.')
		move++;
	return move;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

char[][] nums = new char[11][11];
int sum = 0;

for (int r = 0; r < 11; r++)
	for (int c = 0; c < 11; c++)
		nums[r][c] = 'o';

for (int r = 2; r < 9; r++)
	{
	String str = scan.next();
		if (r <= 3 || r >= 7)
			{
			for (int i = 4; i < 7; i++)
				nums[r][i] = str.charAt(i - 4);
			}
		else
			{
			for (int i = 2; i < 9; i++)
				nums[r][i] = str.charAt(i - 2);
			}
	}

for (int r = 2; r < 9; r++)
{
	if (r <= 3 || r >= 7)
		{
		for (int i = 4; i < 7; i++)
			sum += moves(r , i , nums);
		}
	else
		{
		for (int i = 2; i < 9; i++)
			sum += moves(r , i , nums);
		}
}

System.out.println(sum);
		



scan.close();
	}

}
