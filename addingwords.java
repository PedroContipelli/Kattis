import java.util.Scanner;
import java.util.HashMap;
public class addingwords {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

HashMap<String , Integer> map1 = new HashMap<>();
HashMap<Integer , String> map2 = new HashMap<>();

while (scan.hasNext())
	{
	String operation = scan.next();
	
	if (operation.equals("def"))
		{
		String word = scan.next();
		int num = scan.nextInt();
		
		if (map2.containsKey(map1.get(word)))
			map2.remove(map1.get(word));
		
		map1.put(word , num);
		map2.put(num, word);
		}
	else if (operation.equals("calc"))
		{
		String firstVar = scan.next();
		boolean unknown = false;
		int sum = 0;
		
		System.out.print(firstVar + " ");
		
		if (map1.containsKey(firstVar))
			sum += map1.get(firstVar);
		else
			unknown = true;
		
		while (true)
			{
			String op = scan.next();
			System.out.print(op + " ");
			String var;
			
			if (op.equals("-"))
				{
				var = scan.next();
				System.out.print(var + " ");
				
				if (map1.containsKey(var))
					sum -= map1.get(var);
				else
					unknown = true;
				}
			else if (op.equals("+"))
				{
				var = scan.next();
				System.out.print(var + " ");
				
				if (map1.containsKey(var))
					sum += map1.get(var);
				else
					unknown = true;
				}
			else
				break;
			}
		
		System.out.println(map2.containsKey(sum) && !unknown ? map2.get(sum) : "unknown");
		}
	else
		{
		map1.clear();
		map2.clear();
		}
	}

scan.close();
	}
}