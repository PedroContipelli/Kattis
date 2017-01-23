import java.util.Scanner;
public class 8queens {
	
public static boolean checker(int r , int c , char[][] board) {
	for (int i = -7; i < 8; i++)
		{
		if (i != 0)
			{
			if (r + i >= 0 && r + i < 8 && board[r + i][c] == '*')
				return true;
			
			if (c + i >= 0 && c + i < 8 && board[r][c + i] == '*')
				return true;
			
			if (r + i >= 0 && r + i < 8 && c + i >= 0 && c + i < 8 && board[r + i][c + i] == '*')
				return true;
			
			if (r + i >= 0 && r + i < 8 && c - i >= 0 && c - i < 8 && board[r + i][c - i] == '*')
				return true;
			}
		}
	
		return false;	
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

char[][] board = new char[8][8];
boolean valid = true;
int count = 0;

for (int i = 0; i < 8; i++)
	{
	String str = scan.next();
	
	for (int j = 0; j < 8; j++)
		board[i][j] = str.charAt(j);
	}

for (int i = 0; i < 8; i++)
	for (int j = 0; j < 8; j++)
		if (board[i][j] == '*')
			{
			count++;
			
			if (checker(i , j , board))
				valid = false;
				break;
			}

if (count != 8)
	valid = false;

System.out.println(valid ? "valid" : "invalid");

scan.close();
	}
}
