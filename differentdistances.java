import java.util.Scanner;
public class differentdistances {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
	{
	double x1 = scan.nextDouble();
	
	if (x1 == 0)
		break;
	
	double y1 = scan.nextDouble();
	double x2 = scan.nextDouble();
	double y2 = scan.nextDouble();
	double p = scan.nextDouble();
	
	System.out.printf( "%.5f" , Math.pow(Math.pow(Math.abs(x1 - x2) , p) + Math.pow(Math.abs(y1 - y2), p), 1 / p));
	System.out.println();
	}

scan.close();
	}

}
