import java.util.Scanner;
public class humancannonball2 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

for (int i = 0; i < cases; i++)
	{
	double v0 = scan.nextDouble();
	double theta = scan.nextDouble() * Math.PI / 180.0;
	double x1 = scan.nextDouble();
	double h1 = scan.nextDouble();
	double h2 = scan.nextDouble();
	
	double t = x1 / (v0 * Math.cos(theta));
	double y = v0 * t * Math.sin(theta) - (0.5 * 9.81 * t * t);
	
	System.out.println(h1 + 1 <= y && h2 - 1 >= y ? "Safe" : "Not Safe");
	}

scan.close();
	}
}