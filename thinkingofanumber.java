import java.util.ArrayList;
public class thinkingofanumber {
	
public static boolean div(int i , ArrayList<Integer> div) {

	for (int x : div)
		if (i % x != 0)
			return false;
	
	return true;
}

public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

while (true)
	{
	int clues = scan.getInt();
	
	if (clues == 0)
		break;
	
	boolean infinite = true;
	boolean printed = false;
	
	int min = 0;
	int max = Integer.MAX_VALUE;
	ArrayList<Integer> divs = new ArrayList<>();
	
	while (clues --> 0)
		{
		String str = scan.getWord();
		scan.getWord();
		
		int x = scan.getInt();
		
		if (str.equals("greater"))
			min = Math.max(min, x);
		else if (str.equals("less"))
			{
			infinite = false;
			max = Math.min(max, x); 
			}
		else
			divs.add(x);
		}
	
	if (infinite)
		{
		printed = true;
		scan.println("infinite");
		}
	else
		{
		for (int i = min + 1; i < max; i++)
			if (div(i , divs))
				{
				scan.print(i + " ");
				printed = true;
				}
		
		if (printed)
			scan.println();
		}
	
	if (!printed)
		scan.println("none");
	}

scan.close();
	}
}