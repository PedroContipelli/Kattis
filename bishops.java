import java.util.Scanner;
public class bishops {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while(scan.hasNextInt())
	{
	int N = scan.nextInt();
	
	System.out.println(N != 1 ? 2 * (N - 1) : 1);
	}

scan.close();
    }
}

/*
if (N != 1)
	System.out.println(2 * (N - 1));
else
	System.out.println(1);
*/