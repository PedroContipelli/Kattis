import java.util.Scanner;
public class reverserot {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
    {
    int a = scan.nextInt();
    
    if (a == 0)
        break;
    
    String str = scan.next();
    String str1 = "";
    String str2 = "";
    
    for (int i = str.length() - 1; i >= 0; i--)
        str1 += str.substring(i , i + 1);
    
    for (int i = 0; i < str1.length(); i++)
        {
        int x = str1.charAt(i);
        x -= 65;
        
        if (x == 30)
            x = 26;
        if (x == -19)
            x = 27;
        
        x += a;
        x %= 28;
        x += 65;
        
        if (x >= 65 && x <= 90)
        str2 += (char)x;
        
        if (x == 91)
        str2 += "_";
        if (x == 92)
        str2 += ".";
        }
    
    System.out.println(str2);
    }

scan.close();
    }
}