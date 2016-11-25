import java.util.ArrayList;
import java.util.Scanner;
public class flyingsafely {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

while (cases --> 0)
	{
	int nodes = scan.nextInt() + 1; // Cities
	int edges = scan.nextInt(); // Pilots
	
	boolean[][] graph = new boolean[nodes][nodes]; // Flights
	boolean[] visit = new boolean[nodes];
	
	while (edges --> 0)
		{
		int node1 = scan.nextInt();
		int node2 = scan.nextInt();
		
		graph[node1][node2] = true;
		graph[node2][node1] = true;
		}
	
	ArrayList<Integer> queue = new ArrayList<>();
	queue.add(1);
	visit[1] = true;
	
	int count = 0;
	
	while (!queue.isEmpty())
		{
		int node = queue.remove(0);
		
		for (int i = 1; i < graph.length; i++)
			if (!visit[i] && graph[node][i])
				{
				queue.add(i);
				count++;
				visit[i] = true;
				}
		}
	
	System.out.println(count);
	}

scan.close();
	}
}