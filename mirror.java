import java.util.Scanner;
public class mirror {
	
public static String reverse(String str) {
	String build = "";
	
	for (int i = str.length() - 1; i >= 0; i--)
		build += str.charAt(i);
	
	return build;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

for (int zax = 1; zax <= cases; zax++)
	{
	int rows = scan.nextInt();
	scan.nextInt();
	
	String[] strs = new String[rows];
	
	for (int i = 0; i < strs.length; i++)
		strs[i] = scan.next();
	
	System.out.println("Test " + zax);
	
	for (int i = strs.length - 1; i >= 0; i--)
		System.out.println(reverse(strs[i]));
	}

scan.close();
	}
}