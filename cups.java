import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
public class cups {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

HashMap<Integer , String> map = new HashMap<>();
ArrayList<Integer> nums = new ArrayList<>();

for (int i = 0; i < cases; i++)
	{
	try
		{
		int radius = scan.nextInt() / 2;
		String color = scan.next();
		
		map.put(radius, color);
		nums.add(radius);
		}
	catch (Exception e)
		{
		String color = scan.next();
		int radius = scan.nextInt();
		
		map.put(radius , color);
		nums.add(radius);
		}
	}

Collections.sort(nums);

for (int i = 0; i < nums.size(); i++)
	System.out.println(map.get(nums.get(i)));

scan.close();
	}
}