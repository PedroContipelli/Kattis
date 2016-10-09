import java.util.Scanner;
public class t9spelling {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int testcases = scan.nextInt();
scan.nextLine();
String[] letters = new String[8];
letters[0] = "abc";
letters[1] = "def";
letters[2] = "ghi";
letters[3] = "jkl";
letters[4] = "mno";
letters[5] = "pqrs";
letters[6] = "tuv";
letters[7] = "wxyz";
int oldsave = 0;
int current = 0;

for (int zax = 0; zax < testcases; zax++)
	{
	String str = scan.nextLine();
	System.out.print("Case #" + (zax + 1) + ": ");
	
	for (int i = 0; i < str.length(); i++)
		{
		current = 2;
		String letter = str.substring(i , i + 1);
		
		if (letter.equals(" "))
			{
			current = 0;
			
			if (current == oldsave)
				System.out.print(" ");
			
			System.out.print(0);
			}
		
		else
			{
			while (! letters[current - 2].contains(letter))
				current++;
			
			if (current == oldsave)
				System.out.print(" ");
			
			for (int j = 0; j < letters[current - 2].indexOf(letter) + 1; j++)
				System.out.print(current);
			}
		
		oldsave = current;
		}
	
	System.out.println();
	}

scan.close();
	}

}
