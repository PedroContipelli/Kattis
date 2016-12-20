import java.util.Scanner;
public class irepeatmyself {

public static String mult(String str , int n) {
	
	String build = "";
	
	for (int i = 0; i < n; i++)
		build += str;
	
	return build;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();
scan.nextLine();

while (cases --> 0)
	{
	String line = scan.nextLine();
	
	for (int i = 1; i <= line.length(); i++)
		{
		String str = line.substring(0 , i);
		
		int n = (line.length() / str.length()) + 1;
		
		if (mult(str , n).startsWith(line))
			{
			System.out.println(str.length());
			break;
			}
		}
	}

scan.close();
	}
}