import java.util.Scanner;
public class howmanydigits {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (scan.hasNextInt())
	{
	int x = scan.nextInt();
	System.out.println((int)(Math.log10(Math.sqrt(2 * x * Math.PI)) + x*Math.log10(x / Math.E)) + 1);
	}

scan.close();
	}
}