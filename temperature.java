import java.util.Scanner;
public class temperature {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

double X = scan.nextDouble();
double Y = scan.nextDouble();

if (X == 0 && Y == 1)
    System.out.println("ALL GOOD");
else if (Y == 1)
    System.out.println("IMPOSSIBLE");
else
    System.out.printf("%.7f" , X / (1 - Y));

scan.close();
    }
}