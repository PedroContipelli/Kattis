public class rockpaperscissors {

public static boolean win(String move1 , String move2) {
	
	if (move1.equals("rock"))
		return move2.equals("scissors");
	
	if (move1.equals("paper"))
		return move2.equals("rock");
	
	return move2.equals("paper");
}

public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

while (true)
	{
	int players = scan.getInt();
	
	if (players == 0)
		break;
	
	int[] wins = new int[players];
	int[] loss = new int[players];
	
	int k = scan.getInt();
	int moves = k * (players*(players - 1) / 2);
	
	for (int zax = 0; zax < moves; zax++)
		{
		int player1 = scan.getInt();
		String move1 = scan.getWord();
		int player2 = scan.getInt();
		String move2 = scan.getWord();
		
		if (move1.equals(move2))
			continue;
		
		if (win(move1 , move2))
			{
			wins[player1 - 1]++;
			loss[player2 - 1]++;
			}
		else
			{
			wins[player2 - 1]++;
			loss[player1 - 1]++;
			}
		}
	
	for (int i = 0; i < players; i++)
		{
		int win = wins[i];
		int los = loss[i];
		
		if (win + los == 0)
			System.out.println("-");
		else
			{
			System.out.printf("%.3f", win / (double)(win + los));
			System.out.println();
			}
		}
	
	System.out.println();
	}

scan.close();
	}
}