import java.util.Scanner;
public class estimatingtheareaofacircle {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
	{
	double radius = scan.nextDouble();
	double total  = scan.nextInt();
	double marked = scan.nextInt();
	
	if (radius == 0 && total == 0 && marked == 0)
		break;
	
	System.out.printf("%.6f" , radius * radius * Math.PI);
	System.out.print(" ");
	System.out.printf("%.6f" , (marked / total) * 4 * radius * radius);
	System.out.println();
	}

scan.close();

	}

}
