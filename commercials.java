import java.util.Scanner;
public class commercials {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int len = scan.nextInt();
int price = scan.nextInt();

int[] nums = new int[len];

for (int i = 0; i < len; i++)
	nums[i] = scan.nextInt() - price;

int max_so_far = 0;
int max_up_now = 0;

for (int i = 0; i < len; i++)
	{
	max_up_now += nums[i];
	
	if (max_up_now < 0)
		max_up_now = 0;
	
	if (max_up_now > max_so_far)
		max_so_far = max_up_now;
	}

System.out.println(max_so_far);
scan.close();
	}
}