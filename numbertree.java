import java.util.Scanner;
public class numbertree {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

long height = (long)(Math.pow(2 , scan.nextInt() + 1) - 1);
long subtract = 0;
String str = scan.nextLine();
    
if (str.length() == 0)
    System.out.println(height);
else
    {
    str = str.substring(1);
    for (int i = 0; i < str.length(); i++)
        {
        if (str.charAt(i) == 'L')
        subtract = (2 * subtract) + 1;
        else
        subtract = (2 * subtract) + 2;
        }
    
    System.out.println(height - subtract);
    }
    
scan.close();
    }
}