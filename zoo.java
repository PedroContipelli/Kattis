import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
public class zoo {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int list = 1;

while (true)
	{ 
	int animals = scan.nextInt();
	scan.nextLine();
	
	if (animals == 0)
		break;
	
	HashMap<String , Integer> counts = new HashMap<>();
	ArrayList<String> names = new ArrayList<>();
	
	for (int i = 0; i < animals; i++)
		{
		String animal = scan.nextLine();
		animal = animal.substring(animal.lastIndexOf(" ") + 1).toLowerCase();
		
		if (!names.contains(animal))
			{
			names.add(animal);
			counts.put(animal, 1);
			}
		else
			counts.put(animal, counts.get(animal) + 1);
		}
	
	Collections.sort(names);
	
	System.out.println("List " + list + ":");
	list++;
	
	for (int i = 0; i < names.size(); i++)
		System.out.println(names.get(i) + " | " + counts.get(names.get(i)));
	}

scan.close();
	}
}