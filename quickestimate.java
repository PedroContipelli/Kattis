import java.util.Scanner;
public class quickestimate {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
    
int x = scan.nextInt();

for (int i = 0; i < x; i++)
    {
    String str = scan.next();
    System.out.println(str.length());
    }
    
scan.close();
    }
}