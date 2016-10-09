import java.util.Scanner;
public class beavergnaw {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
	{
	double D = scan.nextDouble();
	double V = scan.nextDouble();
	
	if (D == 0 && V == 0)
		break;
	
	System.out.println(Math.cbrt( (((-6) * V) / Math.PI) + (D*D*D)));
	}

scan.close();
	}
}