import java.util.Scanner;
public class quiteaproblem {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while(scan.hasNextLine())
	{
	String str = scan.nextLine();
	str = str.toLowerCase();
	
	if (str.contains("problem"))
		System.out.println("yes");
	else
		System.out.println("no");
	}

scan.close();
	}
}