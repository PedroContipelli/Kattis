import java.util.Scanner;
import java.util.ArrayList;
public class hidden {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

ArrayList<String> pass = new ArrayList<String>();
String in = scan.next();

for (int i = 0; i < in.length(); i++)
	pass.add(in.substring(i , i + 1));

String str = scan.next();

for (int i = 0; i < str.length(); i++)
	{
	String letter = str.substring(i , i + 1);
	
	if (! pass.contains(letter))
		continue;
	
	if (letter.equals(pass.get(0)))
		{
		pass.remove(0);
		continue;
		}
	else
		break;
	}

if (pass.size() == 0)
	System.out.println("PASS");
else
	System.out.println("FAIL");

scan.close();
	}

}
