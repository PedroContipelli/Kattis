import java.util.Scanner;
public class quickestimate {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
    
int cases = scan.nextInt();

while (cases --> 0)
    {
    String str = scan.next();
    System.out.println(str.length());
    }
    
scan.close();
    }
}