import java.util.Scanner;
import java.math.BigInteger;
public class rationalarithmetic {

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

for (int zax = 0; zax < cases; zax++)
    {
    BigInteger num1 = new BigInteger(scan.next());
    BigInteger den1 = new BigInteger(scan.next());
    
    String operand = scan.next();
    
    BigInteger num2 = new BigInteger(scan.next());
    BigInteger den2 = new BigInteger(scan.next());
    
    BigInteger num3;
    BigInteger den3;
    
    if (operand.equals("+"))
        {
        num3 = (num1.multiply(den2)).add( num2.multiply(den1));
        den3 = den1.multiply(den2);
        }
    else if (operand.equals("-"))
        {
        num3 = (num1.multiply(den2)).subtract(num2.multiply(den1));
        den3 = den1.multiply(den2);
        }
    else if (operand.equals("*"))
        {
        num3 = num1.multiply(num2);
        den3 = den1.multiply(den2);
        }
    else
        {
        num3 = num1.multiply(den2);
        den3 = den1.multiply(num2);
        }
    
    BigInteger GCF = num3.gcd(den3);
    num3 = num3.divide(GCF);
    den3 = den3.divide(GCF);
    
    if (den3.compareTo(BigInteger.ZERO) < 0)
        {
        den3 = den3.negate();
        num3 = num3.negate();
        }
    
    System.out.println(num3 + " / " + den3);
    }

scan.close();
    }
}