import java.util.ArrayList;
import java.util.Scanner;
public class rhyming {
	
public static boolean contains(String[] group , String word) {
	for (String str : group)
		if (word.endsWith(str))
			return true;
	
	return false;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String word = scan.next();
int n = scan.nextInt();
scan.nextLine();

ArrayList<String[]> groups = new ArrayList<>(n);

while (n --> 0)
	groups.add(scan.nextLine().split(" "));

int m = scan.nextInt();
scan.nextLine();

while (m --> 0)
	{
	String phrase = scan.nextLine();
	boolean found = false;
	
	for (String[] group : groups)
		if (contains(group , phrase) && contains(group , word))
			{
			found = true;
			break;
			}
	
	System.out.println(found ? "YES" : "NO");
	}

scan.close();
	}
}