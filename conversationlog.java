import java.util.*;
public class conversationlog {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int msgs = scan.nextInt();
scan.nextLine();

HashSet<String> allWords = new HashSet<>();

HashMap<String , Integer> wordCount = new HashMap<>();
HashMap<String , HashSet<String>> userVocab = new HashMap<>();

while (msgs --> 0)
	{
	StringTokenizer token = new StringTokenizer(scan.nextLine());
	
	String user = token.nextToken();
	
	if (!userVocab.containsKey(user))
		userVocab.put(user, new HashSet<>());
	
	while (token.hasMoreTokens())
		{
		String word = token.nextToken();
		
		if (!wordCount.containsKey(word))
			wordCount.put(word , 0);
		else
			wordCount.put(word, wordCount.get(word) + 1);
		
		userVocab.get(user).add(word);
		allWords.add(word);
		}
	}

for (String name : userVocab.keySet())
	allWords.retainAll(userVocab.get(name));

String[] words = allWords.toArray(new String[0]);

if (words.length == 0)
	System.out.println("ALL CLEAR");
else
	{
	Arrays.sort(words , new Comparator<String>() {
		public int compare (String str1 , String str2) {
			int a = wordCount.get(str1);
			int b = wordCount.get(str2);
			
			if (a == b)
				return str1.compareTo(str2);
			else
				return b - a;
		}
	});
	
	for (String word : words)
		System.out.println(word);
	}

scan.close();
	}
}