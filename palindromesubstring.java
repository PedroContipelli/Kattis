import java.util.*;
public class palindromesubstring {
    
public static boolean isPalindrome(String str) {

    for (int i = 0; i < str.length(); i++)
        if (str.charAt(i) != str.charAt(str.length() - 1 - i))
            return false;
    
    return true;
}

public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

while (scan.hasMoreTokens())
    {
    String str = scan.getWord();
    
    TreeSet<String> words = new TreeSet<>();
    
    for (int i = 0; i < str.length() - 1; i++)
        for (int len = 2; i + len <= str.length(); len++)
            if (isPalindrome(str.substring(i , i + len)))
                words.add(str.substring(i , i + len));
    
    for (String word : words)
        scan.println(word);
    
    scan.println();
    }

scan.close();
    }
}