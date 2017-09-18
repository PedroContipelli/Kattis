import java.util.*;
public class terraces {
	
static int[] R = {-1 , 1 , 0 , 0};
static int[] C = {0 , 0 , -1 , 1};
static int rows , cols;

public static boolean inBounds(int checkR , int checkC) {

	return checkR >= 0 && checkR < rows && checkC >= 0 && checkC < cols;
	
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

cols = scan.nextInt();
rows = scan.nextInt();

int total = 0;

boolean[][] visited = new boolean[rows][cols];
int[][] land = new int[rows][cols];

for (int i = 0; i < rows; i++)
	for (int j = 0; j < cols; j++)
		land[i][j] = scan.nextInt();

for (int i = 0; i < rows; i++)
	for (int j = 0; j < cols; j++)
		{
		if (visited[i][j])
			continue;
		
		LinkedList<GardenPoint> queue = new LinkedList<>();
		queue.add(new GardenPoint(i , j));
		visited[i][j] = true;
		
		int count = 0;
		boolean triggered = false;
		
		while (!queue.isEmpty())
			{
			GardenPoint current = queue.remove(0);
			count++;
			int r = current.r;
			int c = current.c;
			
			for (int x = 0; x < 4; x++)
				{
				int newR = r + R[x];
				int newC = c + C[x];
				
				if (inBounds(newR , newC))
					{
					if (!visited[newR][newC] && land[newR][newC] == land[r][c])
						{
						queue.add(new GardenPoint(newR , newC));
						visited[newR][newC] = true;
						}
					
					if (land[newR][newC] < land[r][c])
						triggered = true;
					}
				}
			}
		
			if (!triggered)
				total += count;
		}

System.out.println(total);

scan.close();
	}
}

class GardenPoint {
	
int r , c;

public GardenPoint(int a , int b) {
	r = a;
	c = b;
}

}