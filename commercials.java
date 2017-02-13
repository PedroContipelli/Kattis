import java.util.*;
public class commercials {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int N = scan.nextInt();
int cost = scan.nextInt();

int[] nums = new int[N];

for (int i = 0; i < nums.length; i++)
	nums[i] = scan.nextInt();

// 18 , 35 , 6 , 80 , 15 , 21

for (int i = 0; i < nums.length; i++)
	nums[i] -= cost;

// -2 , 15 , -14 , 60 , -5 , 1

int current = 0;
int max = 0;

for (int x : nums)
	{
	if (current + x > 0)
		current += x;
	else
		current = 0;
	
	max = Math.max(current , max);
	}

System.out.println(max);
scan.close();
	}
}