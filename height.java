import java.util.Scanner;
import java.util.ArrayList;
public class height {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int testcases = scan.nextInt();

for (int zaxbys = 0; zaxbys < testcases; zaxbys++)
	{
	scan.nextInt();
	ArrayList<Integer> nums = new ArrayList<>();
	ArrayList<Integer> nums1 = new ArrayList<>();
	
	for (int i = 0; i < 20; i++)
		nums.add(scan.nextInt());
	
	int sum = 0;
	
	while (nums1.size() < 20)
		{
		int store = nums.remove(0);
		int index = 0;
		while (index != nums1.size() && store > nums1.get(index))
			index++;
		
		nums1.add(index , store);
		sum += nums1.size() - index - 1;
		}
	
	System.out.println(zaxbys + 1 + " " + sum);
	
	}

scan.close();
	}
}