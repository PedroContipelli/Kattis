import java.util.Scanner;
public class heliocentric {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = 1;
while (scan.hasNextInt())
	{
	System.out.print("Case " + cases + ": ");
	
	int earth = scan.nextInt();
	int mars = scan.nextInt();
	int days = 0;
	
	while (earth != 0 || mars != 0)
		{
		earth = (earth + 1) % 365;
		mars = (mars + 1) % 687;
		days++;
		}
	
	System.out.println(days);
	cases++;
	}

scan.close();
	}
}