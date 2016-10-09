import java.util.Scanner;
public class erase {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

boolean success = true;

int overwrites = scan.nextInt();
String str1 = scan.next();
String str2 = scan.next();

if (overwrites % 2 == 0)
	success = str1.equals(str2);
else
	{
	for (int i = 0; i < str1.length(); i++)
		if (str1.charAt(i) == str2.charAt(i))
			success = false;
	}

if (success)
	System.out.println("Deletion succeeded");
else
	System.out.println("Deletion failed");

scan.close();

	}

}
