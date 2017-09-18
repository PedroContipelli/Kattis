import java.util.*;
public class vacuumba {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

while (cases --> 0)
	{
	int moves = scan.nextInt();
	
	double X = 0;
	double Y = 0;
	double angle = 90;
	
	while (moves --> 0)
		{
		double ang = scan.nextDouble();
		double len = scan.nextDouble();
		
		angle += ang;
		
		X += len * Math.cos(Math.toRadians(angle));
		Y += len * Math.sin(Math.toRadians(angle));
		}
	
	System.out.printf("%.4f %.4f \n" , X , Y);
	}

scan.close();
	}
}