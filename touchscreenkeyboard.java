import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
public class touchscreenkeyboard {

static	String str1 = "qwertyuiop";
static	String str2 = "asdfghjkl";
static	String str3 = "zxcvbnm";

public static int Yval (char x) {

	if (str1.contains("" + x))
		return 1;
	
	if (str2.contains("" + x))
		return 2;
	
	return 3;
}

public static int Xval (char x) {
	
	if (str1.contains("" + x))
		return str1.indexOf(x);
	
	if (str2.contains("" + x))
		return str2.indexOf(x);
	
	return str3.indexOf(x);
}

public static int charD(char a , char b) {
	
	int ax = Xval(a);
	int ay = Yval(a);
	int bx = Xval(b);
	int by = Yval(b);
	
	return Math.abs(bx - ax) + Math.abs(by - ay);
}

public static int stringD(String s1 , String s2) {
	
	int sum = 0;
	
	for (int i = 0; i < s1.length(); i++)
		sum += charD(s1.charAt(i) , s2.charAt(i));
	
	return sum;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

for (int zax = 0; zax < cases; zax++)
	{
	String str = scan.next();
	int num = scan.nextInt();
	
	ArrayList<String> words = new ArrayList<>();
	HashMap<String , Integer> map = new HashMap<>();
	
	for (int i = 0; i < num; i++)
		{
		String word = scan.next();
		words.add(word);
		map.put(word, stringD(str , word));
		}
	
	Collections.sort(words , new Comparator<String>() {
		public int compare(String str1, String str2) {
			int num1 = map.get(str1);
			int num2 = map.get(str2);
			
			if (num1 == num2)
				return str1.compareTo(str2);
			else
				return num1 - num2;
		}
	});
	
	for (int i = 0; i < words.size(); i++)
		System.out.println(words.get(i) + " " + map.get(words.get(i)));
	}

scan.close();
	}
}