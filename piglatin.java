import java.util.Scanner;
public class piglatin {
	
public static boolean isVowel(char n) {
	return n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u' || n == 'y';
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (scan.hasNextLine())
	{
	String line = scan.nextLine();
	
	String[] words = line.split(" ");
	
	for (int i = 0; i < words.length; i++)
		{
		String word = words[i];
		if (! isVowel(word.charAt(0)))
			{
			while (! isVowel(word.charAt(0)))
				word = word.substring(1, word.length()) + word.substring(0 , 1);
			
			System.out.print(word + "ay ");
			}
		else
			{
			System.out.print(word + "yay ");
			}
		}
	
	System.out.println();
	}

scan.close();

	}

}