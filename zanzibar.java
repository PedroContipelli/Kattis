import java.util.Scanner;
import java.util.ArrayList;
public class zanzibar {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);


int testcases = scan.nextInt();

for (int zaxbys = 0; zaxbys < testcases; zaxbys++)
	{
	ArrayList<Integer> nums = new ArrayList<>();
	int sum = 0;
	
	while (true)
		{
		int a = scan.nextInt();
		if (a == 0)
			break;
		nums.add(a);
		}
	
	for (int i = 0; i < nums.size() - 1; i++)
		if (2*nums.get(i) < nums.get(i+1))
			sum += (nums.get(i+1) - 2*nums.get(i));
	
	System.out.println(sum);
	}

scan.close();
	}

}
