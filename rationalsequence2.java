import java.util.Scanner;
public class rationalsequence2 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int testcases = scan.nextInt();

for (int zax = 0; zax < testcases; zax++)
	{
	scan.nextInt();
	
	String str = scan.next();
	
	int p = Integer.parseInt(str.substring(0 , str.indexOf("/")));
	int q = Integer.parseInt(str.substring(str.indexOf("/") + 1));
	
	String path = "";
	
	while (p != 1 || q != 1)
		{
		if (p > q)
			{
			p -= q;
			path = "R" + path;
			}
		else
			{
			q -= p;
			path = "L" + path;
			}
		}
	
	int n = 0;

	for (int i = 0; i < path.length(); i++)
		if (path.charAt(i) == 'R')
			n = 2*(n + 1);
		else
			n = 2*n + 1;
	
	System.out.println(zax + 1 + " " + (n + 1));
	}

scan.close();
	}
}