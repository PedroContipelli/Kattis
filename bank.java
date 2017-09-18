import java.util.*;
public class bank {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
	
int people = scan.nextInt();
int time = scan.nextInt();

ArrayList<Integer>[] bank = new ArrayList[time];

for (int i = 0; i < bank.length; i++)
	bank[i] = new ArrayList<>();

while (people --> 0)
	{
	int money = scan.nextInt();
	int leave = scan.nextInt();
	
	bank[leave].add(money);
	}

int total = 0;

ArrayList<Integer> choices = new ArrayList<Integer>();

for (int i = time - 1; i >= 0; i--)
	{
	choices.addAll(bank[i]);
	
	Collections.sort(choices);
	
	if (!choices.isEmpty())
		total += choices.remove(choices.size() - 1);
	}

System.out.println(total);

scan.close();
	}
}