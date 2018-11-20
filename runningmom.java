import java.util.*;
public class runningmom {
    
static HashMap<String , HashSet<String>> graph = new HashMap<>();

public static boolean DFS(String city , HashSet<String> visited) {
        
    visited.add(city);
    
    for (String connect : graph.get(city))
        {
        if (visited.contains(connect))
            return true;
        
        visited.add(connect);
        
        if (DFS(connect , visited))
            return true;
        
        visited.remove(connect);
        }
    
    return false;
}

public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int edges = scan.getInt();

for (int i = 0; i < edges; i++)
    {
    String city1 = scan.getWord();
    String city2 = scan.getWord();
    
    if (!graph.containsKey(city1))
        graph.put(city1 , new HashSet<>());
    
    if (!graph.containsKey(city2))
        graph.put(city2 , new HashSet<>());
    
    graph.get(city1).add(city2);
    }

while (scan.hasMoreTokens())
    {
    String city = scan.getWord();
    
    System.out.println(city + (DFS(city , new HashSet<String>()) ? " safe" : " trapped"));
    }

scan.close();
    }
}