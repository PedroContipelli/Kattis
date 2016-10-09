import java.util.Scanner;
public class recenice {

public static String word(int n) {
	int hundreds = (n / 100) % 10;
	int tens =     (n / 10) % 10;
	int ones =     (n / 1) % 10;
	String[] ten = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	String[] twe = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	String build = "";
	
	if (hundreds > 0)
		build += ten[hundreds] + "hundred";
	
	if (tens >= 2)
		{
		build += twe[tens];
		
		if (ones > 0)
			build += ten[ones];
		}
	else
		build += ten[tens*10 + ones];
	
	return build;
	}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int x = scan.nextInt();
int index = 0;

String[] sentence = new String[x];
int sum = 0;

for (int i = 0; i < x; i++)
	{
	String str = scan.next();
	
	if (str.equals("$"))
		{
		index = i;
		continue;
		}
	
	sum += str.length();
	sentence[i] = str;
	}

for (int i = 1; i < 1000; i++)
	if (word(i).length() + sum == i)
		{
		sentence[index] = word(i);
		break;
		}

for (int i = 0; i < x; i++)
	System.out.print(sentence[i] + " ");

scan.close();
	}
}