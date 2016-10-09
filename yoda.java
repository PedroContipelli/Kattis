import java.util.Scanner;
public class yoda {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String str1 = scan.next();
String str2 = scan.next();

while (str1.length() != str2.length())
	{
	if (str1.length() < str2.length())
		str1 = "0" + str1;
	else
		str2 = "0" + str2;
	}

for (int i = str1.length() - 1; i >= 0; i--)
	{
	int one = Integer.parseInt(str1.substring(i , i + 1));
	int two = Integer.parseInt(str2.substring(i , i + 1));
	
	if (one == two)
		continue;
	else if (one < two)
		str1 = str1.substring(0 , i) + str1.substring(i + 1);
	else
		str2 = str2.substring(0 , i) + str2.substring(i + 1);
	}

if (str1.equals(""))
	System.out.println("YODA");
else
	System.out.println(Integer.parseInt(str1));

if (str2.equals(""))
	System.out.println("YODA");
else
	System.out.println(Integer.parseInt(str2));

scan.close();
	}
}
