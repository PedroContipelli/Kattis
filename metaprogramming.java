import java.util.Scanner;
import java.util.HashMap;
public class metaprogramming {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
HashMap<String , Integer> map = new HashMap<>();

while (scan.hasNext())
	{
	String command = scan.nextLine();
	String[] line = command.split(" ");
	String operation = line[0];
	
	if (operation.equals("define"))
		{
		int x = Integer.parseInt(line[1]);
		String var = line[2];
		map.put(var, x);
		}
	
	else if (operation.equals("eval"))
		{
		
		if (!map.containsKey(line[1]) || !map.containsKey(line[3]))
			System.out.println("undefined");
		else
			{
			int var1 = map.get(line[1]);
			String oper = line[2];
			int var2 = map.get(line[3]);
			
			if (oper.equals("<"))
				System.out.println(var1 < var2);
			if (oper.equals("="))
				System.out.println(var1 == var2);
			if (oper.equals(">"))
				System.out.println(var1 > var2);
			}
		}
	}

	scan.close();
	}
}