import java.util.Scanner;
import java.util.HashMap;
public class babelfish {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

HashMap<String,String> words = new HashMap<>();

String all = scan.nextLine();
while (all.contains(" "))
    {
    String key = all.split(" ")[1];
    String value = all.split(" ")[0];
    words.put(key,value);
    all = scan.nextLine();
    }
    
while(scan.hasNextLine())
    {
    String str = scan.nextLine();
    if (! words.containsKey(str))
    System.out.println("eh");
    else
    System.out.println(words.get(str));
    }

scan.close();
    }
}