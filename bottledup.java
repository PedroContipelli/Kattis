import java.util.Scanner;
public class bottledup {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int total = scan.nextInt();
int v1 = scan.nextInt();
int v2 = scan.nextInt();

int bottles1 = total / v1;

while ((total - (bottles1 * v1)) % v2 != 0)
	{
	bottles1--;
	
	if (bottles1 == -1)
		break;
	}

if (bottles1 == -1)
	System.out.println("Impossible");
else
	System.out.println(bottles1 + " " + ((total - (bottles1 * v1)) / v2));

scan.close();
	}
}