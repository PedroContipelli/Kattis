import java.util.Scanner;
public class bus {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int testcases = scan.nextInt();

int[] nums = new int[31];
nums[0] = 0;

for (int i = 1; i < 31; i++)
	nums[i] = (int)(2 * (nums[i - 1] + 0.5));

for (int i = 0; i < testcases; i++)
	{
	int x = scan.nextInt();
	System.out.println(nums[x]);
	}

scan.close();
	}

}
