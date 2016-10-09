import java.util.Scanner;
public class tracksmoothing {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int testcases = scan.nextInt();

for (int zax = 0; zax < testcases; zax++)
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
	
	for (int i = 0; i < numPoints - 1; i++)
		{
		int dY = y[i + 1] - y[i];
		int dX = x[i + 1] - x[i];
		
		trackLength += Math.sqrt(dY*dY + dX*dX);
		}
	
	int dY = y[0] - y[numPoints - 1];
	int dX = x[0] - x[numPoints - 1];
	
	trackLength += Math.sqrt(dY*dY + dX*dX);
	
	double circumference = 2*radius*Math.PI;
	
	if (trackLength < circumference)
		System.out.println("Not possible");
	else if (trackLength == circumference)
		System.out.println(0);
	else
		{
		System.out.printf("%.6f", (trackLength - circumference)/trackLength);
		System.out.println();
		}
	}

scan.close();
	}

}