import java.util.Scanner;
import java.util.Arrays;
public class permutedarithmeticsequence {

public static boolean arithmetic(int[] nums) {
	int diff = nums[1] - nums[0];
	
	for (int i = 0; i < nums.length - 1; i++)
		if (nums[i + 1] - nums[i] != diff)
			return false;
	
	return true;
}

public static boolean permuted(int[] nums) {
	Arrays.sort(nums);
	return arithmetic(nums);
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int testcases = scan.nextInt();

for (int zaxbys = 0; zaxbys < testcases; zaxbys++)
	{
	int amount = scan.nextInt();
	int[] nums = new int[amount];
	
	for (int i = 0; i < nums.length; i++)
		nums[i] = scan.nextInt();
	
	if (arithmetic(nums))
		System.out.println("arithmetic");
	else if (permuted(nums))
		System.out.println("permuted arithmetic");
	else
		System.out.println("non-arithmetic");
	}

scan.close();
	}
}