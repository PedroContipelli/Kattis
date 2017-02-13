import java.util.*;
public class islandhopping {

static int[] parent;

public static double dist(double x1 , double y1 , double x2 , double y2) {
	double base = x2 - x1;
	double height = y2 - y1;
	
	return Math.hypot(base , height);
}

public static int find(int n) {
	return parent[n] == n ? n : (parent[n] = find(parent[n]));
}

public static void merge(int i , int j) {
	parent[find(i)] = find(j);
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

while (cases --> 0)
	{
	int points = scan.nextInt();
	double[] x = new double[points];
	double[] y = new double[points];
	
	for (int i = 0; i < points; i++)
		{
		x[i] = scan.nextDouble();
		y[i] = scan.nextDouble();
		}
	
	ArrayList<Edge> edges = new ArrayList<>();
	
	for (int i = 0; i < points; i++)
		for (int j = i + 1; j < points; j++)
			edges.add(new Edge(i , j , dist(x[i] , y[i] , x[j] , y[j])));
	
	Collections.sort(edges);
	
	parent = new int[points];
	
	for (int i = 0; i < points; i++)
		parent[i] = i;
	
	int count = 0;
	double sum = 0;
	
	while (count < points - 1)
		{
		Edge edge = edges.remove(0);
		
		if (find(edge.node1) != find(edge.node2))
			{
			merge(edge.node1 , edge.node2);
			sum += edge.distance;
			count++;
			}
		}
	
	System.out.printf("%.5f \n" , sum);
	}

scan.close();
	}
}

class Edge implements Comparable<Edge> {
	
int node1 , node2;
double distance;

public Edge(int a , int b , double x) {
	node1 = a;
	node2 = b;
	distance = x;
}

public int compareTo(Edge edge) {
	double difference = this.distance - edge.distance;
	
	if (difference > 0)
		return 1;
	
	if (difference == 0)
		return 0;
	
	return -1;
}

}