import java.util.Scanner;
public class herman {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int input = scan.nextInt();

System.out.printf("%.6f" , input * input * Math.PI);
System.out.println();
System.out.printf("%.6f" , input * input * 2.0);
System.out.println();

scan.close();
	}
}