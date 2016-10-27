import java.util.Scanner;
public class gamerank {
	
public static int fullStar(int rank) {
	if (rank >= 1 && rank <= 10)
		return 5;
	
	if (rank >= 11 && rank <= 15)
		return 4;
	
	if (rank >= 16 && rank <= 20)
		return 3;
	
	if (rank >= 21 && rank <= 25)
		return 2;
	
	return -1000;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String str = scan.next();
int rank = 25;
int stars = 0;
int streak = 0;

for (int i = 0; i < str.length(); i++)
	{
	boolean win = str.charAt(i) == 'W';
	int star = 0;
	
	if (win)
		{
		streak++;
		star = streak >= 3 && rank >= 6 && rank <= 25 ? 2 : 1;
		stars += star;
		
		if (stars > fullStar(rank))
			{
			stars -= fullStar(rank);
			rank--;
			}
		}
	else
		{
		streak = 0;
		
		if (rank < 20 || (rank == 20 && stars != 0))
			stars--;
		
		if (stars < 0)
			{
			rank++;
			stars = fullStar(rank) - 1;
			}
		}
	
	if (rank == 0)
		{
		System.out.println("Legend");
		break;
		}
	}

if (rank != 0)
	System.out.println(rank);

scan.close();
	}
}