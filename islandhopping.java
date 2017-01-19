import java.util.*;
public class islandhopping {

static int[] parent;

public static int find(int child) {
    return parent[child] == child ? child : (parent[child] = find(parent[child]));
}

public static void merge(int child1 , int child2) {
    parent[find(child1)] = find(child2);
}

public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int cases = scan.getInt();

for (int zax = 0; zax < cases; zax++)
    {
    int numOfIslands = scan.getInt();
    ArrayList<Bridge> bridges = new ArrayList<>();
    ArrayList<Island> islands = new ArrayList<>();
    parent = new int[numOfIslands];
    
    for (int i = 0; i < numOfIslands; i++)
        {
        parent[i] = i;
        islands.add(new Island(scan.getDouble() , scan.getDouble()));
        }
    
    for (int i = 0; i < numOfIslands; i++)
        for (int j = 0; j < i; j++)
            {
            double x1 = islands.get(i).x;
            double y1 = islands.get(i).y;
            double x2 = islands.get(j).x;
            double y2 = islands.get(j).y;
            
            double distance = Math.hypot(x2 - x1 , y2 - y1);
            
            bridges.add(new Bridge(i , j , distance));
            }
    
    Collections.sort(bridges);
    double totalLength = 0;
    int bridgesConstructed = 0;
    
    for (Bridge bridge : bridges)
        {
        if (find(bridge.isle1) != find(bridge.isle2))
            {
            bridgesConstructed++;
            totalLength += bridge.length;
            merge(bridge.isle1 , bridge.isle2);
            
            if (bridgesConstructed == numOfIslands - 1)
                break;
            }
        }

    System.out.printf("%.5f" , totalLength);
    System.out.println();
    }

scan.close();
    }
}

class Bridge implements Comparable<Bridge> {
    
int isle1 , isle2;
double length;

public Bridge(int a , int b , double c) {
    isle1 = a;
    isle2 = b;
    length = c;
}

public int compareTo(Bridge b) {
    if (this.length < b.length)
        return -1;
    
    if (this.length > b.length)
        return 1;
    
    return 0;
}

}

class Island {
    
double x , y;

public Island(double x , double y) {
    this.x = x;
    this.y = y;
}

}