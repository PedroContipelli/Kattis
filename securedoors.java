import java.util.Scanner;
import java.util.ArrayList;
public class securedoors {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int lines = scan.nextInt();
ArrayList<String> building = new ArrayList<>();

for (int i = 0; i < lines; i++)
	{
	String track = scan.next();
	String name = scan.next();
	
	if (track.equals("entry"))
		{
		System.out.print(name + " entered");
		
		if (building.contains(name))
			System.out.println(" (ANOMALY)");
		else
			{
			building.add(name);
			System.out.println();
			}
		}
	else
		{
		System.out.print(name + " exited");
		
		if (! building.contains(name))
			System.out.println(" (ANOMALY)");
		else
			{
			building.remove(name);
			System.out.println();
			}
		}
	}

scan.close();
	}
}