import java.util.Scanner;
public class beatspread {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

for (int zax = 0; zax < cases; zax++)
	{
	int sum = scan.nextInt();
	int diff = scan.nextInt();
	
	if ((sum + diff) % 2 == 1)
		System.out.println("impossible");
	else
		{
		int x = (sum + diff) / 2;
		int y = sum - x;
		
		if (x < 0 || y < 0)
			System.out.println("impossible");
		else
			System.out.println(x + " " + y);
		}
	}

scan.close();
	}

}
