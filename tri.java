import java.util.Scanner;
public class tri {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();

if (a + b == c)
	System.out.println(a + "+" + b + "=" + c);
else if (a - b == c)
	System.out.println(a + "-" + b + "=" + c);
else if (a * b == c)
	System.out.println(a + "*" + b + "=" + c);
else if (a == b + c)
	System.out.println(a + "=" + b + "+" + c);
else if (a == b - c)
	System.out.println(a + "=" + b + "-" + c);
else if (a == b * c)
	System.out.println(a + "=" + b + "*" + c);
else if (a / b == c)
	System.out.println(a + "-" + b + "=" + c);
else if (a == b / c)
	System.out.println(a + "=" + b + "/" + c);

scan.close();
	}

}
