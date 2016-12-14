import java.util.Scanner;
public class convexpolygonarea {
	
public static double shoelace(int[] x , int[] y) {

	int sumL = 0;
	int sumR = 0;
	
	for (int i = 0; i < x.length - 1; i++)
		{
		sumL += y[i] * x[i + 1];
		sumR += x[i] * y[i + 1];
		}
	
	return Math.abs(sumL - sumR) / 2.0;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

while (cases --> 0)
	{
	int sides = scan.nextInt();
	
	int[] x = new int[sides + 1];
	int[] y = new int[sides + 1];
	
	for (int i = 0; i < sides; i++)
		{
		x[i] = scan.nextInt();
		y[i] = scan.nextInt();
		}
	
	x[sides] = x[0];
	y[sides] = y[0];
	
	System.out.println(shoelace(x , y));
	}

scan.close();
	}
}