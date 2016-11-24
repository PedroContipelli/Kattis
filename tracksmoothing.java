import java.util.Scanner;
public class tracksmoothing {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

while (cases --> 0)
	{
	int radius = scan.nextInt();
	int numPoints = scan.nextInt();
	
	double trackLength = 0;
	
	int[] x = new int[numPoints];
	int[] y = new int[numPoints];
	
	for (int i = 0; i < numPoints; i++)
		{
		x[i] = scan.nextInt();
		y[i] = scan.nextInt();
		}
	
	int dY = y[0] - y[numPoints - 1];
	int dX = x[0] - x[numPoints - 1];
	
	trackLength += Math.hypot(dX , dY);
	
	for (int i = 0; i < numPoints - 1; i++)
		{
		dY = y[i + 1] - y[i];
		dX = x[i + 1] - x[i];
		
		trackLength += Math.hypot(dY , dX);
		}
	
	double circumference = 2*radius*Math.PI;
	
	if (trackLength < circumference)
		System.out.println("Not possible");
	else
		{
		System.out.printf("%.6f", (trackLength - circumference)/trackLength);
		System.out.println();
		}
	}

scan.close();
	}

}