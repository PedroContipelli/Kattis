import java.util.Scanner;
public class pet {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int[] nums = new int[5];
int index = 0;
for (int i = 0; i < 5; i++)
	{
	int store = 0;
	
	for (int j = 0; j < 4; j++)
		store += scan.nextInt();

	nums[index] = store;
	index++;
	}

int contestant = 0;
int max = 0;
for (int i = 0; i < 5; i++)
	if (Math.max(max, nums[i]) == nums[i])
		{
		contestant = i + 1;
		max = nums[i];
		}

System.out.println(contestant + " " + max);


scan.close();
	}

}
