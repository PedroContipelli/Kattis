import java.util.Scanner;
import java.math.BigInteger;
public class anagramcounting {
	
public static BigInteger factorial(int n) {
	BigInteger bigN = new BigInteger("1");
	
	for (int i = 2; i <= n; i++)
		bigN = bigN.multiply(BigInteger.valueOf(i));
	
	return bigN;
}

public static int count(String in , char x) {
	
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
	
	for (char c = 'A'; c <= 'Z'; c++)
		num = num.divide(factorial(count(str , c)));
	
	for (char c = 'a'; c <= 'z'; c++)
		num = num.divide(factorial(count(str , c)));
	
	System.out.println(num);
	}

scan.close();
	}
}
