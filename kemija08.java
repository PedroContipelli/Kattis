import java.util.Scanner;
public class kemija08 {
	
public static boolean isVowel(String str) {
	return (str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u"));
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String str = scan.nextLine();
String lin = "";

for (int i = 0; i < str.length(); i++)
	{
	if (isVowel(str.substring(i , i + 1)))
		{
		lin += str.charAt(i);
		i += 2;
		}
	else
		lin += str.charAt(i);
	}

System.out.println(lin);

scan.close();
	}

}
