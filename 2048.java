import java.util.*;
public class 2048 {
	
public static void move(int[] nums) {
	
boolean[] merge = new boolean[4];

for (int i = 0; i < nums.length; i++)
	for (int j = i; j > 0 && !merge[j - 1]; j--)
		{
		if (nums[j - 1] == 0)
			{
			nums[j - 1] = nums[j];
			nums[j] = 0;
			}
		else if (nums[j - 1] == nums[j])
			{
			nums[j - 1] *= 2;
			nums[j] = 0;
			merge[j - 1] = true;
			break;
			}
		else
			break;
		}
}

public static int[][] rotate(int[][] nums) {
	
int[][] rot = new int[4][4];

for (int i = 0; i < 4; i++)
	for (int j = 0; j < 4; j++)
		rot[3 - j][i] = nums[i][j];

return rot;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
	
int[][] nums = new int[4][4];

for (int i = 0; i < 4; i++)
	for (int j = 0; j < 4; j++)
		nums[i][j] = scan.nextInt();

int move = scan.nextInt();

for (int i = 0; i < move; i++)
	nums = rotate(nums);
	
for (int i = 0; i < 4; i++)
	move(nums[i]);

for (int i = 0; i < 4 - move; i++)
	nums = rotate(nums);

for (int i = 0; i < 4; i++)
	System.out.println(Arrays.toString(nums[i]).substring(1 , Arrays.toString(nums[i]).length() - 1).replace("," , ""));

scan.close();
	}
}
