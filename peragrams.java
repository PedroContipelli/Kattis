import java.util.Scanner;
import java.util.ArrayList;
public class peragrams {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

ArrayList<String> checked = new ArrayList<String>();
String str = scan.next();

for (int i = 0; i < str.length(); i++)
	{
	if (checked.contains(str.substring(i , i + 1)))
		checked.remove(checked.indexOf(str.substring(i , i + 1)));
	else
		checked.add(str.substring(i , i + 1));
	}

if (checked.size() == 0)
	System.out.println("0");
else
    System.out.println(checked.size() - 1);

scan.close();
	}
}