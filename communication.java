import java.util.Scanner;
import java.util.HashMap;
public class communication {
	
public static String XOR(String str1 , String str2) {
	
	String build = "";
	
	for (int i = 0; i < str1.length(); i++)
		if (str1.charAt(i) == str2.charAt(i))
			build += "0";
		else
			build += "1";
		
	return build;
}

public static int scramble(int n) {
	
	String str1 = Integer.toBinaryString(n);
	
	while (str1.length() < 8)
		str1 = "0" + str1;
	
	String str2 = str1.substring(1) + "0";
	
	return Integer.parseInt(XOR(str1 , str2) , 2);
	
}


public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

HashMap<Integer , Integer> map = new HashMap<>();

for (int i = 0; i < 256; i++)
	map.put(scramble(i), i);

int cases = scan.nextInt();

for (int i = 0; i < cases; i++)
	System.out.print(map.get(scan.nextInt()) + " ");

scan.close();
	}
}