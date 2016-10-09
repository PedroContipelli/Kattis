import java.util.Scanner;
public class areal {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

long area = scan.nextLong();
System.out.printf( "%.7f" , 4 * Math.sqrt(area) );

scan.close();
    }
}