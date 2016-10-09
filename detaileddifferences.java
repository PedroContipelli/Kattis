import java.util.Scanner;
public class detaileddifferences {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

for (int zaxby = 0; zaxby < cases; zaxby++)
	{
	String str1 = scan.next();
	String str2 = scan.next();
	
	System.out.println(str1);
	System.out.println(str2);
	for (int i = 0; i < str1.length(); i++)
		if (str1.charAt(i) == str2.charAt(i))
		System.out.print(".");
		else
		System.out.print("*");
	
	System.out.println();
	}


scan.close();
	}

}