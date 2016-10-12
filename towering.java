import java.util.Arrays;
import java.util.Scanner;
public class towering {

static int tower1;
static int tower2;
static int[] tow1;
static int[] tow2;

public static int sum(int[] nums) {
	return nums[0] + nums[1] + nums[2];
}

public static void permute(int[] nums , int index) {
	if (index == nums.length - 1)
		{
		int[] tow1 = {nums[0] , nums[1] , nums[2]};
		int[] tow2 = {nums[3] , nums[4] , nums[5]};
		
		if (sum(tow1) == tower1 && sum(tow2) == tower2)
			{
			Arrays.sort(tow1);
			Arrays.sort(tow2);
			
			System.out.print(tow1[2] + " " + tow1[1] + " " + tow1[0] + " ");
			System.out.println(tow2[2] + " " + tow2[1] + " " + tow2[0]);
			System.out.close();
			
			return;
			}
		}
	else
		{
		for (int i = index; i < nums.length; i++)
			{
			int temp = nums[index];
			nums[index] = nums[i];
			nums[i] = temp;
			
			permute(nums , index + 1);
			
			temp = nums[index];
			nums[index] = nums[i];
			nums[i] = temp;
			}
		}
	
	return;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int[] nums = new int[6];

for (int i = 0; i < 6; i++)
	nums[i] = scan.nextInt();

Arrays.sort(nums);

tower1 = scan.nextInt();
tower2 = scan.nextInt();

permute(nums , 0);

scan.close();
	}
}