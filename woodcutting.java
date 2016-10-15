import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class woodcutting {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int testcases = scan.nextInt();

for (int zax = 0; zax < testcases; zax++)
	{
	ArrayList<Integer> totals = new ArrayList<>();
	int customers = scan.nextInt();
	
	for (int c = 0; c < customers; c++)
		{
		int numWood = scan.nextInt();
		int total = 0;
		
		for (int i = 0; i < numWood; i++)
			total += scan.nextInt();
		
		totals.add(total);
		}
	
	Collections.sort(totals);
	
	int sum = 0;
	long totalSum = 0;
	
	for (int i = 0; i < totals.size(); i++)
		{
		sum += totals.get(i);
		totalSum += sum;
		}
	
	double avg = totalSum / ((double)totals.size());
	
	System.out.printf("%.7f" , avg);
	System.out.println();
	}

scan.close();
	}
}