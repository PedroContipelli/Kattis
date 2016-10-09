import java.util.Arrays;
import java.util.Scanner;
public class kornislav {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int[] nums = new int[4];

for (int i = 0; i < 4; i++)
	nums[i] = scan.nextInt();

Arrays.sort(nums);

System.out.println(nums[0] * nums[2]);

scan.close();
	}

}