public class weakvertices {
	
public static boolean triangle(int r , int[][] nums) {

	for (int i = 0; i < nums.length; i++)
		{
		if (nums[r][i] == 1)
			{
			for (int j = i + 1; j < nums.length; j++)
				if (nums[r][j] == 1 && nums[i][j] == 1)
					return true;
			}
		}
	
	return false;
}

public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

while (true)
	{
	int n = scan.getInt();
	
	if (n == -1)
		break;
	
	int[][] nums = new int[n][n];
	
	for (int r = 0; r < n; r++)
		for (int c = 0; c < n; c++)
			nums[r][c] = scan.getInt();
	
	for (int r = 0; r < n; r++)
		if (triangle(r , nums))
			continue;
		else
			System.out.print(r + " ");
	
	System.out.println();
	}









scan.close();
	}
}