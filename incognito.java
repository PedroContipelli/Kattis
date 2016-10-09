import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class incognito {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

for (int zax = 0; zax < cases; zax++)
	{
	int attributes = scan.nextInt();
	ArrayList<String> categories = new ArrayList<>();
	HashMap<String , Integer> map = new HashMap<>();
	
	for (int i = 0; i < attributes; i++)
		{
		scan.next();
		
		String str = scan.next();
		
		if (map.containsKey(str))
			map.put(str, map.get(str) + 1);
		else
			{
			categories.add(str);
			map.put(str, 2);
			}
		}
	
	int total = 1;
	
	for (int i = 0; i < categories.size(); i++)
		total *= map.get(categories.get(i));
	
	System.out.println(total - 1);
	}

scan.close();
	}
}