import java.util.Scanner;
public class enlarginghashtables {

public static boolean isPrime(long n) {
    
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
    
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
	{
	int n = scan.nextInt();
	
	if (n == 0)
		break;
	
	for (long i = 2*n + 1; true; i++)
		{
		if (isPrime(i))
			{
			System.out.print(i);
			break;
			}
		}
	
	System.out.println(!isPrime(n) ? " (" + n + " is not prime)" : "");
	}

scan.close();
	}

}
