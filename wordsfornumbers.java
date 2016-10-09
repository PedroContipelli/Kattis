import java.util.Scanner;
public class wordsfornumbers {
    
public static String word(int n) {
    int hundreds = (n / 100) % 10;
    int tens =     (n / 10) % 10;
    int ones =     (n / 1) % 10;
    String[] ten = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    String[] twe = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    String build = "";
    
    if (hundreds > 0)
        build += ten[hundreds] + "hundred";
    
    if (tens >= 2)
        {
        build += twe[tens];
        
        if (ones > 0)
            build += "-" + ten[ones];
        }
    else
        build += ten[tens*10 + ones];
    
    return build;
    }

public static boolean isNum(String str) {
    try { Integer.parseInt(str); }
    catch (Exception e) { return false; }
    return true;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (scan.hasNextLine())
    {
    String line = scan.nextLine();
    String[] words = line.split(" ");
    
    for (int i = 0; i < words.length; i++)
        {
        if (isNum(words[i]))
            {
            String word = word(Integer.parseInt(words[i]));
            
            if (i == 0)
                word = word.substring(0, 1).toUpperCase() + word.substring(1);
            
            words[i] = word;
            }
        }
    
    for (int i = 0; i < words.length; i++)
        System.out.print(words[i] + " ");
    
    System.out.println();
    }

scan.close();
    }
}