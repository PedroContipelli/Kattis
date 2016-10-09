import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
public class notamused {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int day = 1;
while (scan.hasNext())
	{
	ArrayList<String>  names = new ArrayList<String>();
	HashMap<String , Integer> map1 = new HashMap<String , Integer>();
	HashMap<String , Integer> map2 = new HashMap<String , Integer>();
	scan.next();
	
	while (true)
		{
		String str = scan.next();
		
		if (str.equals("CLOSE"))
			break;
		
		if (str.equals("ENTER"))
			{
			String name = scan.next();
			int time = scan.nextInt();
			
			if (! names.contains(name))
				names.add(name);
			
			map2.put(name, time);
			}
		
		if (str.equals("EXIT"))
			{
			String name = scan.next();
			int time = scan.nextInt();
			
			if (map1.containsKey(name))
			map1.put(name, map1.get(name) + (time - map2.get(name)));
			else
			map1.put(name, time - map2.get(name));
				
			}
		}
	
	Collections.sort(names);
	System.out.println("Day " + day);
	day++;
	
	for (int i = 0; i < names.size(); i++)
		{
		System.out.print(names.get(i) + " $");
		System.out.printf( "%.2f" , map1.get(names.get(i)) / 10.0);
		System.out.println();
		}
	
	System.out.println();
	}

	scan.close();
	}
}