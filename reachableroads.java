import java.util.*;
public class reachableroads {
    
static int[] parent;

public static int find(int n) {
    return parent[n] == n ? n : (parent[n] = find(parent[n]));
}

public static void merge(int i , int j) {
    parent[find(i)] = find(j);
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cities = scan.nextInt();

while (cities --> 0)
    {
    int nodes = scan.nextInt();
    parent = new int[nodes];
    
    for (int i = 0; i < parent.length; i++)
        parent[i] = i;
    
    int roads = scan.nextInt();
    
    while (roads --> 0)
        merge(scan.nextInt() , scan.nextInt());
    
    HashSet<Integer> networks = new HashSet<>();
    
    for (int i = 0; i < parent.length; i++)
        networks.add(find(i));
    
    System.out.println(networks.size() - 1);
    }

scan.close();
    }
}