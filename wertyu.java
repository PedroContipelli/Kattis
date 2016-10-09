import java.util.Scanner;
public class wertyu {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String row0 = "`1234567890-=";
String row1 = "QWERTYUIOP[]\\";
String row2 = "ASDFGHJKL;'";
String row3 = "ZXCVBNM,./";

while (scan.hasNext())
	{
	String str = scan.next();
	
	for (int i = 0; i < str.length(); i++)
		{
		String x = str.substring(i , i + 1);
		
		if (row0.contains(x))
			System.out.print(row0.charAt(row0.indexOf(x) - 1));
		
		else if (row1.contains(x))
			System.out.print(row1.charAt(row1.indexOf(x) - 1));
		
		else if (row2.contains(x))
			System.out.print(row2.charAt(row2.indexOf(x) - 1));
		
		else if (row3.contains(x))
			System.out.print(row3.charAt(row3.indexOf(x) - 1));
		}
	
	System.out.print(" ");
	}
scan.close();
	}
}