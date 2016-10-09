import java.util.Scanner;
public class quickbrownfox {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt(); 
scan.nextLine();

for (int zax = 1; zax <= cases; zax++)
    {
    char[] letters = new char[26];
    char fill = 'a';
    String str = scan.nextLine().toLowerCase();
    String ans = "";
    
    for (int i = 0; i < letters.length; i++)
        {
        letters[i] = fill;
        fill++;
        }
    
    for (int i = 0; i < str.length(); i++)
        {
        char test = str.charAt(i);
        for (int x = 0; x < letters.length; x++)
            {
            if (test == letters[x])
                letters[x] = '0';
            }
        }
    
    for (int i = 0; i < letters.length; i++)
        {
        if (letters[i] != '0')
        ans += letters[i];
        }
    
    if (ans.equals(""))
    System.out.println("pangram");
    else
    System.out.println("missing " + ans);
    }

scan.close();
	}
}