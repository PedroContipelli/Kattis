import java.util.Arrays;
public class plantingtrees {
public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int trees = scan.getInt();
int[] nums = new int[trees];

for (int i = 0; i < nums.length; i++)
	nums[i] = scan.getInt();

Arrays.sort(nums);
int max = 0;

for (int i = nums.length - 1; i >= 0; i--)
	{
	nums[i] += 1 + (nums.length - i);
	
	if (nums[i] > max)
		max = nums[i];
	}

System.out.println(max);
scan.close();
	}
}