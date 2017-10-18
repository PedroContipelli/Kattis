import java.util.*;
public class t9spelling {
	
static String data = "abc*|def*|ghi*|jkl*|mno*|pqrs|tuv*|wxyz";

public static int times(char letter) {

	if (letter == ' ')
		return 1;
	
	return data.indexOf(letter) % 5 + 1;
}

public static int numbr(char letter) {
	
	if (letter == ' ')
		return 0;
	
	return data.indexOf(letter) / 5 + 2;
}

public static String print(char letter , char last) {

	String build = "";
	
	for (int i = 0; i < times(letter); i++)
		build += numbr(letter);
	
	return build;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();
scan.nextLine();

for (int num = 1; num <= cases; num++)
	{
	System.out.print("Case #" + num + ": ");
	
	String line = scan.nextLine();
	
	char last = 'X';
	
	for (int i = 0; i < line.length(); i++)
		{
		char letter = line.charAt(i);
		
		if (numbr(letter) == numbr(last))
			System.out.print(" ");
		
		System.out.print(print(letter , last));
		
		last = letter;
		}
	
	System.out.println();
	}

scan.close();
	}
}