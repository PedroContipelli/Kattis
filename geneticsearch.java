import java.util.HashSet;
import java.util.Scanner;
public class geneticsearch {
	
public static int occurences(String find , String str) {

	int count = 0;
	
	int index = str.indexOf(find);
	
	while (index != -1)
		{
		count++;
		index = str.indexOf(find , index + 1);
		}
	
	return count;
}

public static int setSum(HashSet<String> checks , String str) {
	
	int sum = 0;
	
	for (String find : checks)
		sum += occurences(find , str);
	
	return sum;
}

public static char dna(int x) {
	if (x == 0)
		return 'A';
	if (x == 1)
		return 'G';
	if (x == 2)
		return 'C';
	
	return 'T';
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
	{
	String S = scan.next();
	
	if (S.equals("0"))
		break;
	
	String L = scan.next();
	
	HashSet<String> type2 = new HashSet<>();
	HashSet<String> type3 = new HashSet<>();
	
	for (int i = 0; i < S.length(); i++)
		type2.add(S.substring(0 , i) + S.substring(i + 1));
	
	for (int c = 0; c < 4; c++)
		for (int i = 0; i <= S.length(); i++)
			type3.add(S.substring(0 , i) + dna(c) + S.substring(i));
	
	System.out.println(occurences(S , L) + " " + setSum(type2 , L) + " " + setSum(type3 , L));
	}

scan.close();
	}
}