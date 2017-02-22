import java.util.regex.*;
import java.util.*;
public class dictionaryattack {

// This problem has since been rejudged
// This solution will now give you TLE
	
public static void addTransposes(HashMap<String , Integer> dictionary) {
	
for (int changes = 1; changes <= 3; changes++)
	{
	HashMap<String , Integer> queue = new HashMap<>();
	
	for (String word: dictionary.keySet())
		{
		char[] t = word.toCharArray();
		
		// Transposes of "Hello" : "eHllo" , "Hlelo" , "Hello" (Repeated) , "Helol"
		
		for (int i = 0; i < t.length - 1; i++)
			{
			char temp = t[i];
			t[i] = t[i + 1];
			t[i + 1] = temp;
			
			String transpose = new String(t);
			
			if (!dictionary.containsKey(transpose))
				queue.put(transpose , changes);
			
			temp = t[i];
			t[i] = t[i + 1];
			t[i + 1] = temp;
			}
		}
	
	dictionary.putAll(queue);
	}
}

public static int countDigits(String str) {
	
int count = 0;

for (int i = 0; i < str.length(); i++)
	{
	char x = str.charAt(i);

	if (x >= '0' && x <= '9')
		count++;
	}

return count;
}

public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int N = scan.getInt();
HashMap<String , Integer> dictionary = new HashMap<>();

for (int i = 0; i < N; i++)
	dictionary.put(scan.getWord() , 0);

addTransposes(dictionary);

CandidateLoop:
while (scan.hasMoreTokens())
	{
	String candidate = scan.getWord();
	String candidateRegex = candidate.replaceAll("[0-9]" , "[a-zA-Z]");
	
	int changes = countDigits(candidate);
	
	for (String word : dictionary.keySet())
		{
		if (Pattern.matches(candidateRegex , word))
			{
			if (changes + dictionary.get(word) <= 3)
				continue CandidateLoop;
			}
		}
	
	System.out.println(candidate);
	}

scan.close();
    }
}
