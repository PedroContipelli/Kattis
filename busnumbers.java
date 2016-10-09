import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class busnumbers {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int numbers = scan.nextInt();
ArrayList<Integer> nums = new ArrayList<Integer>();

for (int i = 0; i < numbers; i++)
	nums.add(scan.nextInt());

Collections.sort(nums);

for (int i = 0; i < numbers; i++)
	{
	int length = 1;
	System.out.print(nums.get(i));
	
		for (int j = 1; i + j < nums.size(); j++)
			if (nums.get(i + j) == nums.get(i + j - 1) + 1)
				length++;
			else
				break;
		
	if (length > 2)
		{
		System.out.print("-" + (nums.get(i) + length - 1) + " ");
		i += length - 1;
		}
	else
		{
		System.out.print(" ");
		}
	}

scan.close();
}
}
