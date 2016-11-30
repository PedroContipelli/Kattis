import java.util.Scanner;
public class howmanydigits2 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

double[] sums = new double[1000000 + 1];

for (int i = 2; i <= 1000000; i++)
	sums[i] = sums[i - 1] + Math.log10(i);

while (scan.hasNextInt())
	{
	int x = scan.nextInt();
	
	System.out.println((int)sums[x] + 1);
	}

scan.close();
	}
}

/* TLE Solution
 
while (scan.hasNextInt())
	{
	int x = scan.nextInt();
	double sum = 0;
	
	for (int i = 1; i <= x; i++)
		sum += Math.log10(i);
	
	System.out.println((int)sum + 1);
	}
*/