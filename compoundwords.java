import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class compoundwords {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

ArrayList<String> words = new ArrayList<>();
ArrayList<String> compound = new ArrayList<>();

while (scan.hasNext())
	words.add(scan.next());

for (int i = 0; i < words.size(); i++)
	for (int x = i + 1; x < words.size(); x++)
		{
		if (! compound.contains(words.get(i) + words.get(x)))
		compound.add(words.get(i) + words.get(x));
		
		if (! compound.contains(words.get(x) + words.get(i)))
		compound.add(words.get(x) + words.get(i));
		}

Collections.sort(compound);

for (int i = 0; i < compound.size(); i++)
	System.out.println(compound.get(i));

scan.close();
	}

}
