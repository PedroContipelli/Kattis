import java.util.ArrayList;
public class bing {
	
static ArrayList<String> words = new ArrayList<>();

public static int index(String word) {
	if (words.isEmpty())
		return 0;
	
	if (words.size() < 3)
		{
		for (int i = 0; i < words.size(); i++)
				if (word.compareTo(words.get(i)) <= 0)
					return i;
		
		return words.size();
		}
	
	int down = 0;
	int up = words.size();
	
	while (up >= down)
		{
		int index = (up + down) / 2;
		
		if (index == words.size())
			return index;
		
		if (word.compareTo(words.get(index)) <= 0)
			up = index - 1;
		else
			down = index + 1;
		}
	
	return down;
}

public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

String word = "";
int count = 0;
int index = 0;
int wrds = scan.getInt();

for (int i = 0; i < wrds; i++)
	{
	count = 0;
	word = scan.getWord();
	index = index(word);
	
	words.add(index , word);
	
	for (int j = index + 1; j < words.size(); j++)
		{
		if (words.get(j).startsWith(word))
			count++;
		else
			break;
		}
	
	System.out.println(count);
	}

scan.close();
	}
}