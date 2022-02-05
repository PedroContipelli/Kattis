import java.util.*;

public class kattissquest
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);	
		TreeMap<Quest, Integer> quests = new TreeMap<>();
		
		int N = scan.nextInt();
		
		for (int i = 0; i < N; i++)
		{
			String type = scan.next();
			
			if (type.equals("add"))
			{
				Quest q = new Quest(scan.nextInt(), scan.nextInt());
				
				if (!quests.containsKey(q))
					quests.put(q, 0);
				
				quests.put(q, quests.get(q) + 1);
				
				// System.out.println(quests);
			}
			
			if (type.equals("query"))
			{
				int energy = scan.nextInt();
				long totalGold = 0;
				
				while (true)
				{
					Quest q = quests.floorKey(new Quest(energy, 100_000));
					
					if (q == null)
						break;
					
					energy -= q.energy;
					totalGold += q.gold;
					
					quests.put(q, quests.get(q) - 1);
					
					if (quests.get(q) == 0)
						quests.remove(q);
				}
				
				System.out.println(totalGold);
			}
		}
		
		scan.close();
	}
}

class Quest implements Comparable<Quest>
{
	int energy, gold;
	long placing;
	
	public Quest(int energy, int gold)
	{
		this.energy = energy;
		this.gold = gold;
		this.placing = 200_000L * energy + gold;
	}
	
	public int compareTo(Quest other)
	{
		return (int)Math.signum(this.placing - other.placing);
	}
	
	public String toString()
	{
		return String.format("[%d,%d]", energy, gold);
	}
}
