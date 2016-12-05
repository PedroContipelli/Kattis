import java.util.HashMap;
import java.util.HashSet;
public class brexit {
    
static HashSet<Integer> left = new HashSet<>();
static HashMap<Integer , HashSet<Integer>> map = new HashMap<>();
static HashMap<Integer , Integer> sizes = new HashMap<>();

public static boolean half(int c) {
  return map.get(c).size() <= sizes.get(c) / 2.0;
}

public static void leave(int c) {
    
    left.add(c);
    
    for (int x : map.get(c))
        map.get(x).remove(c);
        
    for (int x : map.get(c))
        if (half(x))
            leave(x);
    
    map.get(c).clear();
}

public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

scan.getInt();
int edges = scan.getInt();
int country = scan.getInt();
int first = scan.getInt();

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

for (int x : map.keySet())
    sizes.put(x , map.get(x).size());

leave(first);

System.out.println(half(country) ? "leave" : "stay");

scan.close();
    }
}