import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class closingtheloop {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int testcases = scan.nextInt();
String str;

for (int zaxbys = 0; zaxbys < testcases; zaxbys++)
	{
	ArrayList<Integer> reds = new ArrayList<>();
	ArrayList<Integer> blues = new ArrayList<>();
	int ropes = scan.nextInt();
	
	for (int i = 0; i < ropes; i++)
		{
		str = scan.next();
		if (str.endsWith("B"))
			blues.add(Integer.parseInt(str.substring(0, str.length() - 1)));
		else
			reds.add(Integer.parseInt(str.substring(0, str.length() - 1)));
		}
	
	Collections.sort(reds);
	Collections.sort(blues);
	
	if (reds.isEmpty() || blues.isEmpty())
		System.out.println("0");
	else
	{
	int sum = 0;
	int rope = 0;
	boolean color = true;
	
	while (true)
		{
		rope = 0;
		if (color)
			{
			if (!reds.isEmpty())
			rope = reds.remove(reds.size() - 1);
			}
		else
			{
			if (!blues.isEmpty())
			rope = blues.remove(blues.size() - 1);
			}
		
		if (rope == 0)
			break;
		
		color = !color;
		System.out.println(rope);
		sum += rope - 1;
		}
	
		if (color)
		System.out.println(sum - rope);
		else
		System.out.println(sum);
	}
	}
scan.close();
}
}
