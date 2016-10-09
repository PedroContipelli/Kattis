import java.util.Scanner;
import java.math.BigDecimal;
import java.math.MathContext;
public class stirlingsapproximation {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

double sqrt2pi = Math.sqrt(2 * Math.PI);
MathContext mc = new MathContext(10);

while (true)
	{
	int n = scan.nextInt();

	if (n == 0)
		break;
	
	BigDecimal ans = BigDecimal.ONE;

	for (int i = n; i > 0; i--)
		ans = ans.multiply(BigDecimal.valueOf((i * Math.E) / n) , mc);

	ans = ans.divide(BigDecimal.valueOf(sqrt2pi * Math.sqrt(n)) , 8 , BigDecimal.ROUND_HALF_UP);
	System.out.println(ans);
	}

scan.close();
	}
}