import java.util.Scanner;
import java.util.HashMap;
public class anewalphabet{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

HashMap<String , String> map = new HashMap<>();
String[] lett = new String[26];
String[] alph = {"@","8","(","|)","3","#","6","[-]","|","_|","|<","1","[]\\/[]","[]\\[]","0","|D","(,)","|Z","$","']['","|_|","\\/","\\/\\/","}{","`/","2"};

for (int i = 0; i < lett.length; i++)
	lett[i] = "" + (char)(i + 97);

for (int i = 0; i < alph.length; i++)
	map.put(lett[i], alph[i]);

String str = scan.nextLine().toLowerCase();
String build = "";

for (int i = 0; i < str.length(); i++)
	{
	String part = str.substring(i, i + 1);
	if (map.containsKey(part))
		build += map.get(part);
	else
		build += part;
	}

System.out.println(build);

scan.close();
	}
}