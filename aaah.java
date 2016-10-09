import java.util.Scanner;
public class aaah {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String str = scan.next();
String str1 = scan.next();

if (str.length() >= str1.length())
	System.out.println("go");
else
	System.out.println("no");

scan.close();
	}

}
