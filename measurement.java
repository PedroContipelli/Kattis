import java.util.Scanner;
import java.math.BigDecimal;
public class measurement {
static int[] nums = {1 , 1000 , 12 , 3 , 22 , 10 , 8 , 3};

public static int index(String str) {
	
	if (str.equals("thou") || str.equals("th"))
		return 0;
	
	if (str.equals("inch") || str.equals("in"))
		return 1;
	
	if (str.equals("foot") || str.equals("ft"))
		return 2;
	
	if (str.equals("yard") || str.equals("yd"))
		return 3;
	
	if (str.equals("chain") || str.equals("ch"))
		return 4;
	
	if (str.equals("furlong") || str.equals("fur"))
		return 5;
	
	if (str.equals("mile") || str.equals("mi"))
		return 6;
	
	return 7;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

	BigDecimal amount = new BigDecimal(scan.next());
	int unit1 = index(scan.next());
	scan.next();
	int unit2 = index(scan.next());
	
	if (unit1 < unit2)
		{
		for (int i = unit1 + 1; i <= unit2; i++)
			amount = amount.divide(BigDecimal.valueOf(nums[i]) , 20 , BigDecimal.ROUND_HALF_DOWN);
		}
	else
		{
		for (int i = unit1; i > unit2; i--)
			amount = amount.multiply(BigDecimal.valueOf(nums[i]));
		}
	
	System.out.println(amount);
	
scan.close();
	}

}
