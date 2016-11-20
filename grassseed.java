import java.util.Scanner;
public class grassseed {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

double cost = scan.nextDouble();
int lawns = scan.nextInt();

double area = 0;

while (lawns --> 0)
  area += scan.nextDouble() * scan.nextDouble();
  
System.out.printf("%.7f" , area * cost);

scan.close();
  }
}