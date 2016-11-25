import java.util.Scanner;
public class vacuumba {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

while (cases --> 0)
	{
	int moves = scan.nextInt();
	
	double posX = 0;
	double posY = 0;
	double angle = 90;
	
	while (moves --> 0)
		{
		double ang = scan.nextDouble();
		double len = scan.nextDouble();
		
		angle += ang;
		
		posX += len * Math.cos(Math.toRadians(angle));
		posY += len * Math.sin(Math.toRadians(angle));
		}
	
	System.out.printf("%.6f", posX);
	System.out.print(" ");
	System.out.printf("%.6f", posY);
	System.out.println();
	}

scan.close();
	}
}