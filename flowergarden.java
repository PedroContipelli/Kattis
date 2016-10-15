import java.util.Scanner;
public class flowergarden {
	
public static double distance(int x1 , int y1 , int x2 , int y2) {
	int dx = x2 - x1;
	int dy = y2 - y1;
	return Math.sqrt(dx*dx + dy*dy);
}

public static boolean isPrime(long n) {
    if (n == 2)
        return true;
    
    if (n % 2 == 0 || n <= 1)
        return false;
    
    int sqrt = (int)Math.sqrt(n);
    
    for (int i = 3; i <= sqrt; i += 2)
        if (n % i == 0)
            return false;
    
    return true;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int testcases = scan.nextInt();

for (int zax = 0; zax < testcases; zax++)
	{
	int flowers = scan.nextInt();
	double distance = scan.nextInt();
	
	int count = 0;
	
	int x1 = 0;
	int y1 = 0;
	int x2 = 0;
	int y2 = 0;
	
	for (int i = 0; i < flowers; i++)
		{
		x1 = x2;
		y1 = y2;
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		
		distance -= distance(x1 , y1 , x2 , y2);
		
		if (distance >= 0)
			count++;
		else
			{
			int left = flowers - i - 1;
			
			for (int a = 0; a < left; a++)
				{
				scan.nextInt();
				scan.nextInt();
				}
			
			break;
			}
		}
	
	while ( !(count == 0 || isPrime(count)) )
		count--;
	
	System.out.println(count);
	}

scan.close();
	}
}