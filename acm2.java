import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class acm2 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int problems = scan.nextInt();
int n = scan.nextInt();

ArrayList<Integer> nums = new ArrayList<>(problems);

for (int i = 0; i < problems; i++)
	nums.add(scan.nextInt());

int problemN = nums.remove(n);
Collections.sort(nums);
nums.add(0 , problemN);

int time = 300;
int solves = 0;
int penalty = 0;

while (!nums.isEmpty())
	{
	int currProblem = nums.remove(0);
	time -= currProblem;
	
	if (time < 0)
		break;
	
	solves++;
	penalty += 300 - time;
	}

System.out.println(solves + " " + penalty);
scan.close();
	}
}