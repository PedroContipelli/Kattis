import java.util.HashMap;
import java.util.HashSet;
public class wheresmyinternet {
	
static HashSet<Integer> net = new HashSet<>();
static HashMap<Integer , HashSet<Integer>> map1 = new HashMap<>();
static HashMap<Integer , HashSet<Integer>> map2 = new HashMap<>();

public static void net(int a) {
	
	if (net.contains(a))
		return;
	
	net.add(a);
	
	if (map1.containsKey(a))
		for (int x : map1.get(a))
			net(x);
	
	if (map2.containsKey(a))
		for (int y : map2.get(a))
			net(y);
}

public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int nodes = scan.getInt();
int edges = scan.getInt();

for (int i = 0; i < edges; i++)
	{
	int x = scan.getInt();
	int y = scan.getInt();

	if (map1.containsKey(x))
		map1.get(x).add(y);
	else
		{
		map1.put(x , new HashSet<>());
		map1.get(x).add(y);
		}
	
	if (map2.containsKey(y))
		map2.get(y).add(x);
	else
		{
		map2.put(y , new HashSet<>());
		map2.get(y).add(x);
		}
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