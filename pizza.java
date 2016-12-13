public class pizza {

public static int MDist(int x1 , int y1 , int x2 , int y2) {
	return Math.abs(x2 - x1) + Math.abs(y2 - y1);
}

public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int cases = scan.getInt();

while (cases --> 0)
	{
	int c = scan.getInt();
	int r = scan.getInt();
	
	int[][] nums = new int[r][c];
	
	for (int i = 0; i < r; i++)
		for (int j = 0; j < c; j++)
			nums[i][j] = scan.getInt();
	
	int optR = 0;
	
	int minR = Integer.MAX_VALUE;
	int minC = Integer.MAX_VALUE;
	
	for (int i = 0; i < r; i++)
		{
		int sum = 0;
		
		for (int k = 0; k < r; k++)
			for (int l = 0; l < c; l++)
				sum += MDist(i , 0 , k , l) * nums[k][l];
		
		if (sum > minR)
			break;
		
		optR = i;
		minR = sum;
		}
	
	for (int i = 0; i < c; i++)
		{
		int sum = 0;
		
		for (int k = 0; k < r; k++)
			for (int l = 0; l < c; l++)
				sum += MDist(optR , i , k , l) * nums[k][l];
		
		if (sum > minC)
			break;
		
		minC = sum;
		}
	
	System.out.println(minC + " blocks");
	}

scan.close();
	}
}