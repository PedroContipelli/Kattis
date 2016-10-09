import java.util.Scanner;
import java.util.HashSet;
public class everywhere {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

for (int zax = 0; zax < cases; zax++)
	{
	HashSet<String> set = new HashSet<>();
	
	int cities = scan.nextInt();
	
	for (int i = 0; i < cities; i++)
		set.add(scan.next());
	
	System.out.println(set.size());
	}

scan.close();
    }
}