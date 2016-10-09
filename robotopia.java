import java.util.Scanner;
public class robotopia {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

for (int zax = 0; zax < cases; zax++)
	{
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	int d = scan.nextInt();
	int e = scan.nextInt();
	int f = scan.nextInt();
	
	try
		{
		double y = (e - ((double)(f*a) / b)) / (c - ((double)(d*a) / b));
		double x = (double)(e - c*y) / a;
		
		if (x != (int)x || y != (int)y || x <= 0 || y <= 0)
			System.out.println("?");
		else
			System.out.println((int)x + " " + (int)y);
		}
	catch (Exception ex)
		{
			System.out.println("?");
		}
	}

scan.close();
	}
}