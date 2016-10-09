import java.util.Scanner;
public class calculatingdartscores {
	
public static String dart(int x) {
	
	if (x == 0)
		return "";
	
	if (x % 3 == 0)
		return "triple " + (x / 3) + "\n";
	if (x % 2 == 0)
		return "double " + (x / 2) + "\n";
	
	return "single " + x + "\n";
}
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int n = scan.nextInt();
boolean found = false;

main: for (int a = 1; a <= 3; a++)
		for (int b = 0; b <= 3; b++)	
			for (int c = 0; c <= 3; c++) 
				for (int i = 1; i <= 20; i++)
					for (int j = 1; j <= 20; j++)
						for (int k = 1; k <= 20; k++)
							if (a*i + b*j + c*k == n)
								{
								found = true;
								System.out.print(dart(a*i));
								System.out.print(dart(b*j));
								System.out.print(dart(c*k));
								break main;
								}

if (!found)
	System.out.println("impossible");

scan.close();
}
}