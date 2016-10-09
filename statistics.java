import java.util.Scanner;
public class statistics {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = 0;

while (scan.hasNextInt())
    {
    cases++;
    int nums = scan.nextInt();
    int min =  10000000;
    int max = -10000000;
    
    for (int i = 0; i < nums; i++)
        {
        int store = scan.nextInt();
        min = Math.min(min, store);
        max = Math.max(max, store);
        }
    
    System.out.println("Case " + cases + ": " + min + " " + max + " " + (max - min));
    }

scan.close();
    }
}