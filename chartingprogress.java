import java.util.*;
public class chartingprogress {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (scan.hasNext())
	{
	ArrayList<String> graph = new ArrayList<>();
	
	while (true)
		{
		String row = scan.nextLine();
		
		if (row.isEmpty())
			break;
		
		graph.add(row);
		
		if (!scan.hasNext())
			break;
		}
	
	int pos = graph.get(0).length() - 1;
	
	for (String row : graph)
		{
		int length = row.length();
		int asterisks = 0;
		
		for (int i = 0; i < length; i++)
			if (row.charAt(i) == '*')
				asterisks++;
		
		char[] newRow = row.replace("*" , ".").toCharArray();
		
		for (int i = 0; i < asterisks; i++)
			{
			newRow[pos] = '*';
			pos--;
			}
		
		System.out.println(new String(newRow));
		}
	
	System.out.println();
	}

scan.close();
	}
}