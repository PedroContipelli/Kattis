import java.util.Scanner;
import java.util.ArrayList;
public class vote {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int testcases = scan.nextInt();

for (int zaxbys = 0; zaxbys < testcases; zaxbys++)
	{
	
	int candidates = scan.nextInt();
	int total = 0;
	int index = 0;
	int max = 0;
	int winners = 0;
	ArrayList<Integer> nums = new ArrayList<>();
	
	for (int i = 0; i < candidates; i++)
		{
		int vote = scan.nextInt();
		nums.add(vote);
		total += vote;
		}
	
	for (int i = 0; i < candidates; i++)
		max = Math.max(max, nums.get(i));
	
	for (int i = 0; i < candidates; i++)
		if (nums.get(i) == max)
			{
			index = i;
			winners++;
			}
	
	if (winners > 1)
		System.out.println("no winner");
	else
		{
		if (max > (total / 2))
			System.out.print("majority");
		else
			System.out.print("minority");
		
		System.out.println(" winner " + (index + 1));
		}
	}

scan.close();
}}