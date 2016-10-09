import java.util.Scanner;
public class justaminute {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();
int mins = 0;
int length = 0;

for (int i = 0; i < cases; i++)
	{
	mins   += scan.nextInt();
	length += scan.nextInt();
	}

if (length <= mins * 60)
	System.out.println("measurement error");
else
	System.out.println((double)length / (mins * 60));

scan.close();
	}

}
