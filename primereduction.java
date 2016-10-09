import java.util.Scanner;
public class primereduction {

	public static boolean isPrime(int n) {
		
		if (n == 2)
			return true;
		
		if (n % 2 == 0)
			return false;
		
		int sqrt = (int)Math.sqrt(n);
		
		for (int i = 3; i <= sqrt; i += 2)
			if (n % i == 0)
				return false;
		
		return true;
	}
	
	public static void reduce(int prime , int count) {
		
		count++;
		if (isPrime(prime))
			{
			System.out.println(prime + " " + count);
			return;
			}
		
		int sum = 0;
		int i = 2;
		
		while (true)
			{
			
			if (prime % i == 0)
				{
				prime /= i;
				sum += i;
				
				if (isPrime(prime))
					{
					sum += prime;
					break;
					}
				
				i = 1;
				}
			
			i++;
			}
		
		reduce(sum , count);
	}

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	while (true)
		{
		int x = scan.nextInt();
		
			if (x == 4)
				break;
			
		reduce(x , 0);
		}
	
	scan.close();
	}
}