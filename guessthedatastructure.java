import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class guessthedatastructure {
	
public static boolean stack(int[] cmds , int[] vals) {
	ArrayList<Integer> stack = new ArrayList<>();
	
	for (int i = 0; i < cmds.length; i++)
		{
		if (cmds[i] == 1)
			stack.add(vals[i]);
		
		else if (stack.isEmpty() || stack.remove(stack.size() - 1) != vals[i])
			return false;
		}
	
	return true;
}

public static boolean queue(int[] cmds , int[] vals) {
	ArrayList<Integer> queue = new ArrayList<>();
	
	for (int i = 0; i < cmds.length; i++)
		{
		if (cmds[i] == 1)
			queue.add(vals[i]);
		
		else if (queue.isEmpty() || queue.remove(0) != vals[i])
			return false;
		}
	
	return true;
}

public static boolean Pqueue(int[] cmds , int[] vals) {
	ArrayList<Integer> queue = new ArrayList<>();
	
	for (int i = 0; i < cmds.length; i++)
		{
		if (cmds[i] == 1)
			queue.add(vals[i]);
		
		else
			{
			Collections.sort(queue);
			
			if (queue.isEmpty() || queue.remove(queue.size() - 1) != vals[i])
				return false;
			}
		}
	
	return true;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (scan.hasNextInt())
	{
	int n = scan.nextInt();

	int[] cmds = new int[n];
	int[] vals = new int[n];
	
	for (int i = 0; i < n; i++)
		{
		cmds[i] = scan.nextInt();
		vals[i] = scan.nextInt();
		}
	
	int count = 0;
	
	String type = "impossible";
	
	if (stack(cmds , vals))
		{
		type = "stack";
		count++;
		}

	if (queue(cmds , vals))
		{
		type = "queue";
		count++;
		}

	if (Pqueue(cmds , vals))
		{
		type = "priority queue";
		count++;
		}
	
	System.out.println(count > 1 ? "not sure" : type);
	}
	
scan.close();
	}
}