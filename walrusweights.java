import java.util.*;

public class walrusweights
{
	public static int distFrom1000(int num)
	{
		return Math.abs(1000 - num);
	}
	
	public static void main(String[] args)
	{
		// Read in data
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int[] plates = new int[N];
		
		for (int i = 0; i < N; i++)
			plates[i] = scan.nextInt();
		
		// Store all weights we can make under or equal to 1000
		// Adding to these weights may improve our score
		HashSet<Integer> weightsMade = new HashSet<Integer>();
		weightsMade.add(0);
		
		// Also store the best (least) weight we can make over 1000
		// Any weight above this can be discarded because adding to
		// it will only be further from our goal
		int minAfter1000 = Integer.MAX_VALUE;
		
		// Loop through each plate
		for (int plate : plates)
		{
			// Store new weights we can make by adding our current plate
			// to all weights we have already made
			LinkedList<Integer> newWeights = new LinkedList<>();
			
			// Loop through each weight we have already made
			for (int alreadyMade : weightsMade)
			{
				// Calculate a new weight we can make
				int newWeight = alreadyMade + plate;
				
				// If we can already make this weight in a simpler way, discard it
				if (weightsMade.contains(newWeight))
					continue;

				// Keep any weight under or equal to 1000
				if (newWeight <= 1000)
					newWeights.add(newWeight);

				// Keep best (least) weight over 1000
				else if (newWeight < minAfter1000)
				{
					minAfter1000 = newWeight;
					newWeights.add(newWeight);
				}
			}
		
			// Store all new weights in our HashSet to avoid redundant computation
			for (int a : newWeights)
				weightsMade.add(a);
		}
		
		// Store best weight we can make (closest to 1000) and its distance from 1000
		int bestWeight = 0;
		int bestDist = 1000;
		
		// Loop through all the weights we can make and find the best one
		for (int weightMade : weightsMade)
		{
			int dist = distFrom1000(weightMade);
			
			if ((dist < bestDist) || (dist == bestDist && weightMade > bestWeight))
			{
				bestWeight = weightMade;
				bestDist = dist;
			}
		}
		
		// Print answer
		System.out.println(bestWeight);
		
		scan.close();
	}

}
