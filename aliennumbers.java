import java.util.Scanner;
import java.util.HashMap;
public class aliennumbers {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int testcases = scan.nextInt();

for (int zax = 1; zax <= testcases; zax++)
	{
	HashMap<String , Integer> map1 = new HashMap<String , Integer>();
	HashMap<Integer , String> map2 = new HashMap<Integer , String>();
	String num = scan.next();
	String lang1 = scan.next();
	String lang2 = scan.next();
	
	for (int i = 0; i < lang1.length(); i++)
		map1.put(lang1.substring(i, i + 1), i);
	
	for (int i = 0; i < lang2.length(); i++)
		map2.put(i, lang2.substring(i, i + 1));
	
	long x = 0;
	int exp = 0;
	
	while (num.length() > 0)
		{
		x += Math.pow(lang1.length(), exp) * map1.get(num.substring(num.length() - 1));
		num = num.substring(0, num.length() - 1);
		exp++;
		}
	
	int i = 0;
	
	while ((long)Math.pow(lang2.length(), i) <= x)
		i++;
	
	i--;
	
	String str = "";
	
	while (x > 0)
		{
		int digit = (int)(x / (long)Math.pow(lang2.length(), i));
		str += map2.get(digit);
		x -= (long)Math.pow(lang2.length(), i) * digit;
		i--;
		}
	
	while (i > -1)
		{
		str += map2.get(0);
		i--;
		}
	
	System.out.println("Case #" + zax + ": " + str);
	}

scan.close();
	}
}