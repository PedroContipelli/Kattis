import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class golombrulers {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

outer: while (scan.hasNextLine())
	{
	Scanner token = new Scanner(scan.nextLine());
	ArrayList<Integer> nums = new ArrayList<>();
	
	while (token.hasNextInt())
		nums.add(token.nextInt());
	
	ArrayList<Integer> diffs = new ArrayList<>();
	Collections.sort(nums);
	int max = 0;
	
	for (int i = 0; i < nums.size(); i++)
		for (int j = i + 1; j < nums.size(); j++)
			{
			int diff = nums.get(j) - nums.get(i);
			
			if (diff > max)
				max = diff;

			if (diffs.contains(diff))
				{
				System.out.println("not a ruler");
				continue outer;
				}
			else
				diffs.add(diff);
			}
		
	String missing = "";
	
	for (int i = 1; i <= max; i++)
		if (!diffs.contains(i))
			missing += i + " ";
	
	System.out.println(missing.isEmpty() ? "perfect" : "missing " + missing);
	token.close();
	}

scan.close();
	}
}