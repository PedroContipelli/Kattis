import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class recount {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

ArrayList<String> candidates = new ArrayList<>();
HashMap<String , Integer> map = new HashMap<>();
while (true)
	{
	String candidate = scan.nextLine();
	
	if (candidate.equals("***"))
		break;
	
	if (map.containsKey(candidate))
		map.put(candidate, map.get(candidate) + 1);
	else
		{
		candidates.add(candidate);
		map.put(candidate, 0);
		}
	}

int max = 0;
int maxI = 0;
int countMax = 0;

for (int i = 0; i < candidates.size(); i++)
	{
	if (map.get(candidates.get(i)) > max)
		{
		max = map.get(candidates.get(i));
		maxI = i;
		}
	}

for (int i = 0; i < candidates.size(); i++)
	{
	if (map.get(candidates.get(i)) == max)
		countMax++;
	
	if (countMax == 2)
		break;
	}

System.out.println(countMax == 1 ? candidates.get(maxI) : "Runoff!");

scan.close();
	}
}