import java.util.Scanner;
public class triangle {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

double scalar = Math.log10(3.0 / 2);
double adder = Math.log10(3);

int count = 1;

while (scan.hasNextInt())
	{
	int x = scan.nextInt();
	x = (int)(x * scalar + adder) + 1;
	
	System.out.println("Case " + count + ": " + x);
	count++;
	}

scan.close();
	}
}