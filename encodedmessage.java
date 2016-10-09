import java.util.Scanner;
public class encodedmessage {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int testcases = scan.nextInt();
scan.nextLine();

for (int zax = 0; zax < testcases; zax++)
	{
	String str = scan.nextLine();
	int len = (int)Math.sqrt(str.length());
	
	for (int j = 0; j < len; j++)
		for (int i = len - 1; i < str.length(); i += len)
			System.out.print(str.charAt(i - j));
	
	System.out.println();
	}

scan.close();

	}

}