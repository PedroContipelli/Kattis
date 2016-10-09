import java.util.Scanner;
public class asciifigurerotation {
	
public static String spaceR(String in) {
    int i = in.length() - 1;
    
    while (in.charAt(i) == ' ')
        i--;
    
    return in.substring(0, i + 1);
}
	
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
boolean first = true;

while (true)
    {
    int x = scan.nextInt();
    
    if (x == 0)
        break;
    
    if (!first)
    	System.out.println();
    
    first = false;
    
    scan.nextLine();
    
    String[] ascii = new String[x];
    int maxL = 0;
    
    for (int i = 0; i < x; i++)
        {
        String line = scan.nextLine();
        if (line.length() > maxL)
            maxL = line.length();
        
        ascii[i] = line;
        }
    
    for (int c = 0; c < maxL; c++)
        {
    	String print = "";
    	
        for (int r = ascii.length - 1; r >= 0; r--)
            {
            if (c >= ascii[r].length())
            	{
            	print += ' ';
                continue;
            	}
            
            char q = ascii[r].charAt(c);
            
            if (q == '|')
                print += '-';
            else if (q == '-')
                print += '|';
            else
                print += q;
            }
        
        System.out.println(spaceR(print));
        }
    }

    scan.close();
    }
}