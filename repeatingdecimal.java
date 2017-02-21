import java.util.*;
import java.math.*;
public class repeatingdecimal {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (scan.hasNextInt())
    {
    BigDecimal a = new BigDecimal(scan.nextInt());
    BigDecimal b = new BigDecimal(scan.nextInt());
    
    int digits = scan.nextInt();
    
    BigDecimal ans = a.divide(b , digits , BigDecimal.ROUND_DOWN);
    
    System.out.println(ans);
    }

scan.close();
    }
}