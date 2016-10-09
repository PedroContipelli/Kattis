import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class guessthedatastructure {
	
public static boolean stack(int[] cmds) {
	ArrayList<Integer> nums = new ArrayList<>();
	
	for (int i = 0; i < cmds.length; i++)
		{
		int type = cmds[i];
		i++;
		
		if (type == 1)
			nums.add(cmds[i]);
		else
			{
			if (nums.isEmpty() || nums.remove(nums.size() - 1) != cmds[i])
				return false;
			}
		}
	
	return true;
}

public static boolean queue(int[] cmds) {
	ArrayList<Integer> nums = new ArrayList<>();
	
	for (int i = 0; i < cmds.length; i++)
		{
		int type = cmds[i];
		i++;
		
		if (type == 1)
			nums.add(cmds[i]);
		else
			{
			if (nums.isEmpty() || nums.remove(0) != cmds[i])
				return false;
			}
		}
	
	return true;
}

public static boolean priorityQueue(int[] cmds) {
	ArrayList<Integer> nums = new ArrayList<>();
	
	for (int i = 0; i < cmds.length; i++)
		{
		int type = cmds[i];
		i++;
		
		if (type == 1)
			nums.add(cmds[i]);
		else
			{
			Collections.sort(nums);
			if (nums.isEmpty() || nums.remove(nums.size() - 1) != cmds[i])
				return false;
			}
		}
	
	return true;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (scan.hasNext())
	{
	int nums = scan.nextInt();
	int[] cmds = new int[2*nums];
	
	for (int i = 0; i < cmds.length; i++)
		cmds[i] = scan.nextInt();
	
	int types = 0;
	String type = "impossible";
	
	if (stack(cmds))
		{
		types++;
		type = "stack";
		}
	
	if (queue(cmds))
		{
		types++;
		type = "queue";
		}
	
	if (priorityQueue(cmds))
		{
		types++;
		type = "priority queue";
		}
	
		System.out.println(types > 1 ? "not sure" : type);
	}
	
scan.close();
	}
}