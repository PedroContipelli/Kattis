import java.util.Scanner;
public class a2048 {
	
static int[] nums = new int[4];

public static void move() {
	boolean[] merge = new boolean[4];

	for (int z = 1; z < nums.length; z++)
		{
		int cell = nums[z];
		int x = z;
		
		while(true)
			{
			
			if (x == 0)
				break;
			
			if (nums[x - 1] == 0)
				{
				nums[x] = 0;
				nums[x - 1] = cell;
				x -= 1;
				}
			else if (merge[x - 1] || nums[x - 1] != cell)
				{
				break;
				}
			else
				{
				nums[x] = 0;
				nums[x - 1] *= 2;
				merge[x - 1] = true;
				}
			}
		}
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int[][] board = new int[4][4];

for (int r = 0; r < 4; r++)
	for (int c = 0; c < 4; c++)
		board[r][c] = scan.nextInt();

int direction = scan.nextInt();

//0 left
//1 up
//2 right
//3 down

if (direction == 0)
	{
	for (int r = 0; r < 4; r++)
		{
		for (int i = 0; i < 4; i++)
			nums[i] = board[r][i];
		
		move();
		
		for (int i = 0; i < 4; i++)
			board[r][i] = nums[i];
		}
	}
else if (direction == 1)
	{
	for (int c = 0; c < 4; c++)
		{
		for (int i = 0; i < 4; i++)
			nums[i] = board[i][c];
		
		move();
		
		for (int i = 0; i < 4; i++)
			board[i][c] = nums[i];
		}
	}
else if (direction == 2)
	{
	for (int r = 0; r < 4; r++)
		{
		for (int i = 3; i >= 0; i--)
			nums[i] = board[r][3 - i];
		
		move();
		
		for (int i = 0; i < 4; i++)
			board[r][3 - i] = nums[i];
		}
	}
else
	{
	for (int c = 0; c < 4; c++)
		{
		for (int i = 3; i >= 0; i--)
			nums[i] = board[3 - i][c];
		
		move();
		
		for (int i = 0; i < 4; i++)
			board[3 - i][c] = nums[i];
		}
	}

for (int r = 0; r < 4; r++)
	{
	for (int c = 0; c < 4; c++)
		System.out.print(board[r][c] + " ");
	
	System.out.println();
	}

scan.close();
	}

}
