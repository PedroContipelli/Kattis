import java.util.Scanner;
public class triangle {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

double scalar = Math.log10(3.0 / 2);
double adder = Math.log10(3);
int count = 0;
while (scan.hasNextInt())
	{
	int x = scan.nextInt();
	
	x = (int)(x * scalar + adder) + 1;
	count++;
	System.out.println("Case " + count + ": " + x);
	}

scan.close();
	}
}