import java.util.Scanner;
public class conundrum {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);


	String str1 = scan.next();
	String str2 = "";
	
	while (str2.length() < str1.length())
		str2 += "PER";
	
	int count = 0;
	
	for (int i = 0; i < str1.length(); i++)
		if (str1.charAt(i) != str2.charAt(i))
			count++;
	
	System.out.println(count);

scan.close();
	}

}