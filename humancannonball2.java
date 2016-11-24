import java.util.Scanner;
public class humancannonball2 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

while (cases --> 0)
	{
	double v0 = scan.nextDouble();
	double theta = scan.nextDouble();
	double x1 = scan.nextDouble();
	double h1 = scan.nextDouble();
	double h2 = scan.nextDouble();
	
	theta = Math.toRadians(theta);
	
	double t = x1 / (v0 * Math.cos(theta));
	double y = v0 * t * Math.sin(theta) - (0.5 * 9.81 * t * t);
	
	System.out.println(h1 + 1 <= y && h2 - 1 >= y ? "Safe" : "Not Safe");
	}

scan.close();
	}
}