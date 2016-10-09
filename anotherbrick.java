import java.util.Scanner;
public class anotherbrick {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int height = scan.nextInt();
int width = scan.nextInt();
int bricks = scan.nextInt();
boolean build = true;

int[] nums = new int[bricks];

for (int i = 0; i < nums.length; i++)
	nums[i] = scan.nextInt();

int brick = 0;
int wid = 0;

main: for (int high = 1; high <= height; high++)
		{
		wid = width;
		
		while (wid > 0)
			{
			if (brick == nums.length)
				{
				build = false;
				break main;
				}
			else
				{
				wid -= nums[brick];
				}
			
			brick++;
			}
		
		if (wid < 0)
			{
			build = false;
			break main;
			}
		}

if (build)
	System.out.println("YES");
else
	System.out.println("NO");

	}

}
