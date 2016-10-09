import java.util.Scanner;
public class oddities {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);


int testcases = scan.nextInt();

for (int zaxbys = 0; zaxbys < testcases; zaxbys++)
	{
	int a = scan.nextInt();
	
	if (a % 2 == 0)
		System.out.println(a + " is even");
	else
		System.out.println(a + " is odd");
	}

scan.close();
	}

}
