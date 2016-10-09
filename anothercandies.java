import java.util.Scanner;
import java.math.BigInteger;
public class anothercandies {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

for (int zax = 0; zax < cases; zax++)
	{
	int nums = scan.nextInt();
	BigInteger n = BigInteger.ZERO;
	
	for (int i = 0; i < nums; i++)
		n = n.add(BigInteger.valueOf(scan.nextLong()));
	
	System.out.println(n.mod(BigInteger.valueOf(nums)).equals(BigInteger.ZERO) ?  "YES" : "NO");
	}

scan.close();
	}
}