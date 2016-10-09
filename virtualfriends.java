import java.util.ArrayList;
import java.util.HashSet;

public class virtualfriends {
public static void main(String[] args) {
Kattio scan = new Kattio(System.in , System.out);

int cases = scan.getInt();

for (int zax = 0; zax < cases; zax++)
	{
	ArrayList<HashSet<String>> uni = new ArrayList<>();
	
	int friendships = scan.getInt();
	
	for (int zex = 0; zex < friendships; zex++)
		{
		String friend1 = scan.getWord();
		String friend2 = scan.getWord();
		
		if (uni.isEmpty())
			{
			HashSet<String> network = new HashSet<>();
			network.add(friend1);
			network.add(friend2);
			uni.add(network);
			scan.println(2);
			}
		else
			{
			for (int i = 0; i < uni.size(); i++)
				{
				if (uni.get(i).contains(friend1))
					{
					boolean found = false;
					
					for (int x = i + 1; x < uni.size(); x++)
						if (uni.get(x).contains(friend2) && x != i)
							{
							uni.get(i).addAll(uni.get(x));
							uni.remove(x);
							found = true;
							break;
							}
					
					if (!found)
						uni.get(i).add(friend2);
					
					scan.println(uni.get(i).size());
					
					break;
					}
			
				if (uni.get(i).contains(friend2))
					{
					boolean found = false;
					
					for (int x = i + 1; x < uni.size(); x++)
						if (uni.get(x).contains(friend1) && x != i)
							{
							uni.get(i).addAll(uni.get(x));
							uni.remove(x);
							found = true;
							break;
							}
					
					if (!found)
						uni.get(i).add(friend1);
					
					scan.println(uni.get(i).size());
					
					break;
					}
				
				if (i == uni.size() - 1)
					{
					HashSet<String> network = new HashSet<>();
					network.add(friend1);
					network.add(friend2);
					uni.add(network);
					scan.println(2);
					break;
					}
				}
			}
		}
	}

scan.close();
	}
}