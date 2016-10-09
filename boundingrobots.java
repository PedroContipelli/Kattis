import java.util.Scanner;
public class boundingrobots {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
	{
	int ThinkX = 0;
	int ThinkY = 0;
	int x = 0;
	int y = 0;
	int w = scan.nextInt() - 1;
	int l = scan.nextInt() - 1;
	
	if (w + 1 == 0 && l + 1 == 0)
		break;
	
	int moves = scan.nextInt();
	
	for (int i = 0; i < moves; i++)
		{
		String direction = scan.next();
		int distance = scan.nextInt();
		
		if (direction.equals("u"))
			{
			if (y + distance > l)
				y = l;
			else
				y += distance;
			ThinkY += distance;
			}
		
		else if (direction.equals("d"))
			{
			if (y - distance < 0)
				y = 0;
			else
				y -= distance;
			ThinkY -= distance;
			}
		
		else if (direction.equals("r"))
			{
			if (x + distance > w)
				x = w;
			else
				x += distance;
			ThinkX += distance;
			}
		
		else
			{
			if (x - distance < 0)
				x = 0;
			else
				x -= distance;
			ThinkX -= distance;
			}

		}
	
		System.out.println("Robot thinks " + ThinkX + " " + ThinkY);
		System.out.println("Actually at " + x + " " + y);
		System.out.println();
	}

scan.close();
	}
}
