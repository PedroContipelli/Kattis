import java.util.ArrayList;
import java.util.Scanner;
import java.math.BigInteger;
public class threepowers {

public static String toBin(BigInteger num) {
	return num.toString(2);
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

ArrayList<BigInteger> powers3 = new ArrayList<>();
powers3.add(BigInteger.ONE);

for (int i = 1; i < 65; i++)
	powers3.add(powers3.get(i - 1).multiply(new BigInteger("3")));

while (true)
	{
	BigInteger bigS = new BigInteger(scan.next());
	
	if (bigS.equals(BigInteger.ZERO))
		break;
	
	bigS = bigS.subtract(BigInteger.ONE);
	String str = toBin(bigS);
	
	if (bigS.equals(BigInteger.ZERO))
		System.out.println("{ }");
	else
		{
		System.out.print("{ ");
		
		for (int i = str.length() - 1; i >= 0; i--)
			{

			if (str.charAt(i) == '1')
				{
				if (i == 0)
					System.out.print(powers3.get(str.length() - i - 1));
				else
					System.out.print(powers3.get(str.length() - i - 1) + ", ");
				}
			
			}
		
		System.out.println(" }");
		}
	}

scan.close();
	}
}