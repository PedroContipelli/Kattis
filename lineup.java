import java.util.Scanner;
public class lineup {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int amount = scan.nextInt();
String[] names = new String[amount];
boolean increasing = true;
boolean decreasing = true;

for (int i = 0; i < names.length; i++)
	names[i] = scan.next();

for (int i = 0; i < names.length - 1; i++)
	{
	if (names[i].compareTo(names[i + 1]) > 0)
		increasing = false;
	
	if (names[i].compareTo(names[i + 1]) < 0)
		decreasing = false;
	}

if (increasing)
	System.out.println("INCREASING");
else if (decreasing)
	System.out.println("DECREASING");
else
	System.out.println("NEITHER");

scan.close();
	}
}