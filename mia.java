import java.util.Arrays;
import java.util.Scanner;
public class mia {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int[] end = {0 , 0};

while (true)
	{
	int[] p1 = {scan.nextInt() , scan.nextInt()};
	int[] p2 = {scan.nextInt() , scan.nextInt()};
	
	if (Arrays.equals(p1, end) && Arrays.equals(p2, end))
		break;
	
	Arrays.sort(p1);
	Arrays.sort(p2);
	
	if (Arrays.equals(p1, p2))
		System.out.println("Tie.");
	else
		{
		int val1 = Integer.parseInt(p1[1] + "" + p1[0]);
		int val2 = Integer.parseInt(p2[1] + "" + p2[0]);
		int win = val1 > val2 ? 1 : 2;
		
		if (val1 == 21 || val2 == 21)
			win = val1 == 21 ? 1 : 2;
		
		else if (p1[0] == p1[1] && p2[0] == p2[1])
			win = val1 > val2 ? 1 : 2;
			
		else if (p1[0] == p1[1])
			win = 1;
		
		else if (p2[0] == p2[1])
			win = 2;
			
		
		System.out.println("Player " + win + " wins.");
		}	
	}

scan.close();
	}
}