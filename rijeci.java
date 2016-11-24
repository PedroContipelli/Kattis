import java.util.Scanner;
public class rijeci {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int x = scan.nextInt();
int[] fibs = new int[50];

fibs[0] = 1;
fibs[1] = 0;

for (int i = 2; i < fibs.length; i++)
	fibs[i] = fibs[i - 2] + fibs[i - 1];

System.out.println(fibs[x] + " " + fibs[x + 1]);

scan.close();
	}
}