import java.math.BigInteger;
import java.util.Scanner;
public class allaboutthatbase {
    
static BigInteger n1 , n2 , n3;

public static boolean eval(String num1 , String num2 , String num3 , String op , int base) {
    
    if (base == 1)
        {
        if (!(num1.replaceAll("1", "").isEmpty() && num2.replaceAll("1", "").isEmpty() && num3.replaceAll("1", "").isEmpty()))
            return false;
        
        n1 = BigInteger.valueOf(num1.length());
        n2 = BigInteger.valueOf(num2.length());
        n3 = BigInteger.valueOf(num3.length());
        }
    else
        {
        if (base(base) - 1 < max(num1 , num2 , num3))
            return false;
        
        n1 = new BigInteger(num1 , base);
        n2 = new BigInteger(num2 , base);
        n3 = new BigInteger(num3 , base);
        }
    
    BigInteger max = BigInteger.valueOf(2).pow(32).subtract(BigInteger.ONE);
    BigInteger one = BigInteger.ONE;
    
    if (n1.compareTo(max) <= 0 && n1.compareTo(one) >= 0)
    	if (n2.compareTo(max) <= 0 && n2.compareTo(one) >= 0)
    		if (n3.compareTo(max) <= 0 && n3.compareTo(one) >= 0)
    			{
			    if (op.equals("+"))
			        return n1.add(n2).compareTo(n3) == 0;
			    
			    if (op.equals("-"))
			        return n1.subtract(n2).compareTo(n3) == 0;
			    
			    if (op.equals("*"))
			        return n1.multiply(n2).compareTo(n3) == 0;
			    
			    BigInteger[] dr = n1.divideAndRemainder(n2);
			    
			    return dr[1].compareTo(BigInteger.ZERO) == 0 && dr[0].compareTo(n3) == 0;
    			}
    
    return false;
}

public static char base(int n) {
    if (n == 36)
        return (char)('z' + 4);
    
    if (n < 10)
        return (char)('0' + n);
    
    return (char)('a' + (n - 10));
}

public static char max(String a , String b , String c) {
    char max = '0';
    
    String str = a + b + c;
    
    for (int i = 0; i < str.length(); i++)
        if (str.charAt(i) > max)
            max = str.charAt(i);
    
    return max;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

while (cases --> 0)
    {
    String num1 = scan.next();
    String op = scan.next();
    String num2 = scan.next();
    scan.next();
    String num3 = scan.next();
    
    String bases = "";
    
    for (int i = 1; i <= 36; i++)
        if (eval(num1 , num2 , num3 , op , i))
            bases += base(i);
    
    System.out.println(bases.isEmpty() ? "invalid" : bases.replaceAll("~", "0"));
    }

scan.close();
    }
}