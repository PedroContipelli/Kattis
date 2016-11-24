import java.util.Scanner;
import java.util.HashMap;
public class aliennumbers {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

for (int z = 1; z <= cases; z++)
	{
	HashMap<String , Integer> map1 = new HashMap<String , Integer>();
	HashMap<Integer , String> map2 = new HashMap<Integer , String>();
	String num = scan.next();
	String lang1 = scan.next();
	String lang2 = scan.next();
	
	int base1 = lang1.length();
	int base2 = lang2.length();
	
	for (int i = 0; i < lang1.length(); i++)
		map1.put(lang1.substring(i, i + 1), i);
	
	for (int i = 0; i < lang2.length(); i++)
		map2.put(i, lang2.substring(i, i + 1));
	
	long base10Num = 0;
	
	for (int x = num.length() - 1; x >= 0; x--)
		base10Num += map1.get(num.substring(x, x + 1)) * (long)Math.pow(base1, num.length() - x - 1);
	
	int exp = (int)(Math.log(base10Num) / Math.log(base2));
	String str = "";
	
	while (exp --> -1)
		{
		int digit = (int)(base10Num / Math.pow(base2, exp + 1));
		str += map2.get(digit);
		base10Num -= Math.pow(base2, exp + 1) * digit;
		}
	
	System.out.println("Case #" + z + ": " + str);
	}

scan.close();
	}
}