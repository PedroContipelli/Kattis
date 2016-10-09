import java.util.Scanner;
import java.util.HashMap;
public class kitten {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

HashMap<String , String> map = new HashMap<>();

String kitten = scan.next();
scan.nextLine();

while (true)
	{
	String str = scan.nextLine();
	
	if (str.equals("-1"))
		break;
	
	String[] nums = str.split(" ");
	
	for (int i = 1; i < nums.length; i++)
		map.put(nums[i], nums[0]);
	}

while (true)
	{
	System.out.print(kitten + " ");
	
	if (!map.containsKey(kitten))
		break;
	
	kitten = map.get(kitten);
	}

scan.close();
	}
}