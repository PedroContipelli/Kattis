import java.util.Arrays;
public class akcija {
public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int[] nums = new int[scan.getInt()];
int sum = 0;
int sub = 0;

for (int i = 0; i < nums.length; i++)
	{
	int x = scan.getInt();
	nums[i] = x;
	sum += x;
	}

Arrays.sort(nums);

for (int i = nums.length - 3; i >= 0; i -= 3)
	sub += nums[i];

System.out.println(sum - sub);
scan.close();
	}
}