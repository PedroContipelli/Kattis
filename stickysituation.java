import java.util.Arrays;
import java.util.Scanner;
public class stickysituation {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int n = scan.nextInt();
long[] nums = new long[n];
boolean possible = false;

for (int i = 0; i < n; i++)
	nums[i] = scan.nextLong();

Arrays.sort(nums);

for (int i = 0; i < n - 2; i++)
	if (nums[i] + nums[i + 1] > nums[i + 2])
		{
		possible = true;
		break;
		}

System.out.println(possible ? "possible" : "impossible");

scan.close();
	}
}