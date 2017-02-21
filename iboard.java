import java.util.*;
public class iboard {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (scan.hasNextLine())
    {
    String str = scan.nextLine();
    
    int ones = 0;
    int zeros = 0;
    
    for (int i = 0; i < str.length(); i++)
        {
        char a = str.charAt(i);
        
        int one = Integer.bitCount((int)a);
        
        ones += one;
        zeros += 7 - one;
        }

    System.out.println(ones % 2 == 0 && zeros % 2 == 0 ? "free" : "trapped");
    }

scan.close();
    }
}