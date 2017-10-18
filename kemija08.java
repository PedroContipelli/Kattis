import java.util.*;
public class kemija08 {
    
public static boolean isVowel(char letter) {

    return "aeiou".contains("" + letter);    
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String line = scan.nextLine();

String build = "";

for (int i = 0; i < line.length(); i++)
    {
    char letter = line.charAt(i);
    
    build += letter;
    
    if (isVowel(letter))
        i += 2;
    }

System.out.println(build);
scan.close();

    }
}