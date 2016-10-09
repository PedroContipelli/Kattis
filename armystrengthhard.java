public class armystrengthhard {
public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int testcases = scan.getInt();

for (int zax = 0; zax < testcases; zax++)
	{

	int g = scan.getInt();
	int m = scan.getInt();
	int maxM = 0;
	int maxG = 0;
	int temp = 0;
	
	for (int i = 0; i < g; i++)
		{
		temp = scan.getInt();
		if (temp > maxG)
			maxG = temp;
		}
	
	for (int i = 0; i < m; i++)
		{
		temp = scan.getInt();
		if (temp > maxM)
			maxM = temp;
		}
	
	if (maxM > maxG)
		System.out.println("MechaGodzilla");
	else
		System.out.println("Godzilla");
	}

scan.close();
	}
}