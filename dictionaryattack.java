import java.util.regex.*;
import java.util.*;
public class dictionaryattack {
    
static HashSet<String> dictionary = new HashSet<>();
static HashSet<String> dictionary1 = new HashSet<>();
static HashSet<String> dictionary2 = new HashSet<>();
static HashSet<String> dictionary3 = new HashSet<>();

public static void addTransposes(HashSet<String> set , String str) {

    char[] word = str.toCharArray();
    
    for (int i = 0; i < word.length - 1; i++)
        {
        char temp = word[i];
        word[i] = word[i + 1];
        word[i + 1] = temp;
        
        set.add(new String(word));
        
        temp = word[i];
        word[i] = word[i + 1];
        word[i + 1] = temp;
        }
}

public static int countNumbers(String str) {
    
    int count = 0;
    
    for (int i = 0; i < str.length(); i++)
        if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
            count++;
    
    return count;
}

public static String buildRegex(String str) {
    return str.replaceAll("[0-9]" , "[a-zA-Z]");
}

public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int words = scan.getInt();

for (int i = 0; i < words; i++)
    dictionary.add(scan.getWord());

for (String word : dictionary)
    addTransposes(dictionary1 , word);

for (String word : dictionary1)
    addTransposes(dictionary2 , word);

for (String word : dictionary2)
    addTransposes(dictionary3 , word);

while (scan.hasMoreTokens())
    {
    String password = scan.getWord();
    int transposes = 5;
    
    int count = countNumbers(password);
    
    if (count > 3)
        System.out.println(password);
    else
        {
        Pattern pattern = Pattern.compile(buildRegex(password));
        
        for (String word : dictionary)
            {
            Matcher match = pattern.matcher(word);
            
            if (match.find())
                transposes = 0;
            }
        
        for (String word : dictionary1)
            {
            Matcher match = pattern.matcher(word);
            
            if (match.find() && transposes == 5)
                transposes = 1;
            }
        
        for (String word : dictionary2)
            {
            Matcher match = pattern.matcher(word);
            
            if (match.find() && transposes == 5)
                transposes = 2;
            }
        
        for (String word : dictionary3)
            {
            Matcher match = pattern.matcher(word);
            
            if (match.find() && transposes == 5)
                transposes = 3;
            }
        
        count += transposes;
        
        if (count > 3)
            System.out.println(password);
        }
    }

scan.close();
    }
}