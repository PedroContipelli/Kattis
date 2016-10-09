import java.util.Scanner;
public class dst {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

for (int zax = 0; zax < cases; zax++)
	{
	String roll = scan.next();
	int amount = scan.nextInt();
	int hours = scan.nextInt();
	int mins = scan.nextInt();
	
	if (roll.equals("F"))
		{
		hours += amount / 60;
		mins += amount % 60;
		
		if (mins >= 60)
			{
			mins %= 60;
			hours++;
			}
		
		if (hours > 23)
			hours %= 24;
		}
	else
		{
		hours -= amount / 60;
		mins -= amount % 60;
		
		if (mins < 0)
			{
			mins += 60;
			hours--;
			}
		
		if (hours < 0)
			hours += 24;
		}
	
	
	System.out.println(hours + " " + mins);
	}
scan.close();
	}
}