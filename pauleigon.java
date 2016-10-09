import java.util.Scanner;
public class pauleigon {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

long N = scan.nextLong();
long a = scan.nextLong();
long b = scan.nextLong();

if ((a + b) % (2*N) < N)
	System.out.println("paul");
else
	System.out.println("opponent");

scan.close();
	}

}
