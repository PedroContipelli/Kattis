import java.util.Scanner;
public class trollhunt {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int x = scan.nextInt() - 1;
int y = scan.nextInt() / scan.nextInt();

if (x % y == 0)
	System.out.println(x / y);
else
	System.out.println((x / y) + 1);

scan.close();
	}
}