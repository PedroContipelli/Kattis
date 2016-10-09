import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class rollcall {
	
public static int instances(ArrayList<String> nums, String str) {
	
	int count = 0;
	
	for (int i = 0; i < nums.size(); i++)
		if (str.equals(nums.get(i)))
			count++;
	
	return count;
}
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

ArrayList<String> names = new ArrayList<>();
ArrayList<String> firsts = new ArrayList<>();

while(scan.hasNext())
	{
	String first = scan.next();
	String last = scan.next();
	
	firsts.add(first);
	names.add(last + " " + first);	
	}

Collections.sort(names);

while (names.size() != 0)
	{
	String first = names.get(0).substring(names.get(0).indexOf(" ") + 1);
	String last = names.get(0).substring(0, names.get(0).indexOf(" "));
	names.remove(0);
	
	if (instances(firsts , first) > 1)
		System.out.println(first + " " + last);
	else
		System.out.println(first);
	}

scan.close();
	}
}