import java.util.Scanner;
public class sjecista {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

long n = scan.nextLong();
System.out.println((n - 3) * (n - 2) * (n - 1) * (n) / 24);

scan.close();
    }
}