import java.util.Scanner;
public class sumkindofproblem {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

for (int zax = 1; zax <= cases; zax++)
	{
	scan.nextInt();
	int num = scan.nextInt();
	
	System.out.print(zax + " ");
	System.out.print((num * (num + 1) / 2) + " ");
	System.out.print(num * num + " ");
	System.out.println(num * (num + 1) + " ");
	}

scan.close();
	}
}