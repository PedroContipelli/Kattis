import java.util.Scanner;
import java.util.ArrayList;
public class karte {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String deck = scan.next();
ArrayList<String> P = new ArrayList<String>();
ArrayList<String> K = new ArrayList<String>();
ArrayList<String> H = new ArrayList<String>();
ArrayList<String> T = new ArrayList<String>();
boolean poop = false;

for (int i = 0; i < deck.length(); i += 3)
	{
	String str = deck.substring(i , i + 3);
	
	if (str.startsWith("P") && !P.contains(str))
		P.add(str);
	else if (str.startsWith("K") && !K.contains(str))
		K.add(str);
	else if (str.startsWith("H") && !H.contains(str))
		H.add(str);
	else if (str.startsWith("T") && !T.contains(str))
		T.add(str);
	else
		{
		System.out.println("GRESKA");
		poop = true;
		}
	}

if (!poop)
	System.out.println((13 - P.size()) + " " + (13 - K.size()) + " " + (13 - H.size()) + " " + (13 - T.size()));

scan.close();
	}
}