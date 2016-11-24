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

char[][] peg = new char[11][11];
int sum = 0;

for (int i = 0; i < peg.length; i++)
	peg[i] = "ooooooooooo".toCharArray();

for (int r = 2; r <= 8; r++)
	{
	String str = scan.next();
	
	if (str.length() == 3)
		str = "oooo" + str + "oooo";
	else
		str = "oo" + str + "oo";
	
	peg[r] = str.toCharArray();
	}

for (int r = 2; r <= 8; r++)
	for (int c = 2; c <= 8; c++)
		if ((r >= 4 && r <= 6) || (c >= 4 && c <= 6))
			sum += moves(r , c , peg);

System.out.println(sum);

scan.close();
	}
}