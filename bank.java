import java.util.*;
public class bank {

public static int indexOfBest(ArrayList<BankPerson> line , int constraint) {

	int max = -1;
	int index = -1;
	
	for (int i = 0; i < line.size(); i++)
		if (line.get(i).wait >= constraint)
			if (line.get(i).cash > max)
				{
				max = line.get(i).cash;
				index = i;
				}
	
	return index;
	
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int people = scan.nextInt();
int time = scan.nextInt();

ArrayList<BankPerson> line = new ArrayList<>();

for (int i = 0; i < people; i++)
	line.add(new BankPerson(scan.nextInt() , scan.nextInt()));

int total = 0;

for (int i = time; i >= 0; i--)
	{
	int index = indexOfBest(line , i);
	
	if (index != -1)
		total += line.remove(index).cash;
	}

System.out.println(total);
	
scan.close();
	}
}

class BankPerson {
	
int cash , wait;

public BankPerson(int a , int b) {
	cash = a;
	wait = b;
}

}