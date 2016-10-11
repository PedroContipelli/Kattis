import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
public class golombrulers {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

outer: while (scan.hasNextLine())
	{
	String[] Snums = scan.nextLine().split(" ");
	int[] nums = new int[Snums.length];
	HashSet<Integer> diffs = new HashSet<>((nums.length * (nums.length - 1)) / 2);
	ArrayList<Integer> not = new ArrayList<>();
	int max = 0;
	
	for (int i = 0; i < Snums.length; i++)
		nums[i] = Integer.parseInt(Snums[i]);
	
	for (int i = 0; i < nums.length; i++)
		for (int j = 0; j < nums.length; j++)
			if (j != i)
				{
				int diff = nums[i] - nums[j];
				
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
	
	for (int i = 1; i <= max; i++)
		if (! diffs.contains(i))
			not.add(i);
	
	if (not.isEmpty())
		System.out.println("perfect");
	else
		{
		System.out.print("missing ");
		String num = "";
		
		for (int i = 0; i < not.size(); i++)
			num += not.get(i) + " ";
		
		System.out.println(num.substring(0, num.length() - 1));
		}
	}

scan.close();
	}
}