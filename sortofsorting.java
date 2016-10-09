import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class sortofsorting {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
while (true)
	{
	int n = scan.nextInt();
	
	if (n == 0)
		break;
	
	ArrayList<String> names = new ArrayList<>();

	for (int i = 0; i < n; i++)
		names.add(scan.next());
	
	ArrayList<String> original = new ArrayList<>(names);
	Collections.sort(names);
	
	for (int i = 0; i < names.size(); i++)
		{
		ArrayList<Integer> indexes = new ArrayList<>();
		String str = names.get(i).substring(0, 2);
		
		for (int x = 0; x < names.size(); x++)
			{
			
			if (names.get(x).startsWith(str))
				{
				for (int j = 0; j < original.size(); j++)
					if (original.get(j).equals(names.get(x)) && (!indexes.contains(j)))
						indexes.add(j);
				}
			}
		
		Collections.sort(indexes);
		for (int j = 0; j < indexes.size(); j++)
			names.set(i + j, original.get(indexes.get(j)));
		
		i += indexes.size() - 1;
		}
	
	for (int i = 0; i < names.size(); i++)
		System.out.println(names.get(i));
	
	System.out.println();
	}


scan.close();
	}
}