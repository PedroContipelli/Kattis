import java.util.Scanner;
import java.math.BigInteger;
public class anagramcounting {
	
public static BigInteger factorial(int n) {
	BigInteger bigN = new BigInteger("1");
	
	for (int i = 2; i <= n; i++)
		bigN = bigN.multiply(BigInteger.valueOf(i));
	
	return bigN;
}

public static int instance(String in , char x) {
	
	int count = 0;
	
	for (int i = 0; i < in.length(); i++)
		if (in.charAt(i) == x)
			count++;
	
	return count;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (scan.hasNext())
	{
	String str = scan.next();
	
	BigInteger num = factorial(str.length());
	
	for (int i = 65; i < 91; i++)
		num = num.divide(factorial(instance(str , (char)i)));
	
	for (int i = 97; i < 123; i++)
		num = num.divide(factorial(instance(str , (char)i)));
	
	System.out.println(num);
	}



scan.close();
	}
}