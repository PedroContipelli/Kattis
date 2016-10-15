import java.util.Scanner;
public class soylent {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

for (int i = 0; i < cases; i++)
	{
	int num = scan.nextInt();
	System.out.println((int)Math.ceil(num / 400.0));
	}

scan.close();
	}
}