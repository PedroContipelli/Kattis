import java.util.Scanner;
public class trainpassengers {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

long capacity = scan.nextLong();
int stops = scan.nextInt();
boolean possible = true;
long train = 0;
long left = 0;
long entr = 0;
long wait = 0;

for (int zax = 0; zax < stops; zax++)
	{
	left = scan.nextLong();
	entr = scan.nextLong();
	wait = scan.nextLong();
	
	if (left > train)
		possible = false;
	
	train += entr - left;
	
	if ( (train != capacity && wait > 0) || (train > capacity) || (train < 0) || (zax == stops - 1 && wait > 0))
		possible = false;

	}

if (train != 0)
	possible = false;

if (possible)
	System.out.println("possible");
else
	System.out.println("impossible");

scan.close();
	}

}
