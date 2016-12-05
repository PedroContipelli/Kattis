import java.util.HashMap;
import java.util.HashSet;
public class wheresmyinternet {
	
static HashSet<Integer> net = new HashSet<>();
static HashMap<Integer , HashSet<Integer>> map = new HashMap<>();

public static void net(int a) {
	
	if (net.contains(a))
		return;
	
	net.add(a);
	
	if (map.containsKey(a))
		for (int x : map.get(a))
			net(x);
}

public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int nodes = scan.getInt();
int edges = scan.getInt();

for (int i = 0; i < edges; i++)
	{
	int x = scan.getInt();
	int y = scan.getInt();

	if (!map.containsKey(x))
		map.put(x , new HashSet<>());
	
	map.get(x).add(y);
	
	if (!map.containsKey(y))
		map.put(y , new HashSet<>());
	
	map.get(y).add(x);
	}

net(1);

boolean printed = false;

for (int i = 1; i <= nodes; i++)
	if (!net.contains(i))
		{
		scan.println(i);
		printed = true;
		}

if (!printed)
	System.out.println("Connected");

scan.close();
	}
}