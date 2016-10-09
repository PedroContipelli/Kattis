import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class sidewayssorting {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
	{
	int rows = scan.nextInt();
	int columns = scan.nextInt();
	
	if (rows == 0 && columns == 0)
		break;
	
	String[] words = new String[columns];
	
	for (int i = 0; i < words.length; i++)
		words[i] = "";
	
	for (int i = 0; i < rows; i++)
		{
		String str = scan.next();
		
		for (int j = 0; j < columns; j++)
			words[j] += str.charAt(j);
		}
	
	Arrays.sort(words , new Comparator<String>() {
		public int compare(String str1, String str2) {
			str1 = str1.toUpperCase();
			str2 = str2.toUpperCase();
			
			return str1.compareTo(str2);
			}
		});
	
	for (int i = 0; i < rows; i++)
		{
		for (int j = 0; j < words.length; j++)
			System.out.print(words[j].charAt(i));
		
		System.out.println();
		}
	
	System.out.println();
	}

scan.close();
	}
}