import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class parking2 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int testcases = scan.nextInt();

for (int zax = 0; zax < testcases; zax++)
	{
	int stores = scan.nextInt();
	ArrayList<Integer> nums = new ArrayList<>();
	
	for (int i = 0; i < stores; i++)
		nums.add(scan.nextInt());
	
	Collections.sort(nums);
	
	int sum = 0;
	
	for (int i = 0; i < nums.size() - 1; i++)
		sum += nums.get(i + 1) - nums.get(i);
	
	System.out.println(sum * 2);
	}

scan.close();

	}

}
