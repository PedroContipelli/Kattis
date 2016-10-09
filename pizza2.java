import java.util.Scanner;
public class pizza2 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);


double r = scan.nextInt();
double c = scan.nextInt();

System.out.printf("%.6f" , 100 * ((r-c)*(r-c)) / (r*r));


scan.close();
	}

}
