import java.util.Scanner;
public class thebackslashproblem {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (scan.hasNextLine())
	{
	int x = scan.nextInt();
	int num = 0;
	String slashes = "";
	scan.nextLine();
	
	if (x >= 1)
		num = (int)Math.pow(2, x);
	
	for (int i = 0; i < num - 1; i++)
		slashes += "\\";
	
	String str = scan.nextLine();
	String build = "";
	
	for (int i = 0; i < str.length(); i++)
		{
		char val = str.charAt(i);
		
		if ((val >= '!' && val <= '*') || (val >= '[' && val <= ']'))
			build += slashes;
		
		build += str.charAt(i);
		}
	
	System.out.println(build);
	}

scan.close();
	}

}
