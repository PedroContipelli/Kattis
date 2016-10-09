import java.util.Scanner;
import java.util.ArrayList;
public class oddmanout {

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int testcases = scan.nextInt();

for (int zaxbys = 0;  zaxbys < testcases; zaxbys++)
	{
	int couples = scan.nextInt();
	ArrayList<Integer> nums = new ArrayList<>();
	ArrayList<Integer> chck = new ArrayList<>();
	long fin = 0;
	
	for (int i = 0; i < couples; i++)
		nums.add(scan.nextInt());
		
	for (int i = 0; i < couples; i++)
		if (! chck.contains(nums.get(i)))
			{
			chck.add(nums.get(i));
			fin += nums.get(i);
			}
		else
			fin -= nums.get(i);
	
	System.out.println("Case #" + (zaxbys + 1) + ": " + fin);
	}

scan.close();
	}

}
