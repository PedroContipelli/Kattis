import java.util.Scanner;
public class simon {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int testcases = scan.nextInt();
scan.nextLine();

for (int zaxbys = 0; zaxbys < testcases; zaxbys++)
	{
	String str = scan.nextLine();
	
	if (str.startsWith("simon says") && !str.equals("simon says"))
		System.out.println(str.substring(11));
	else
		System.out.println();
	}

scan.close();
	}

}
