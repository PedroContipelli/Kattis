import java.util.Scanner;
public class almostperfect {
	
public static int properSum(int n) {
	int sum = 0;
	double x = Math.sqrt(n);
	
	if ((int)x == x)
		sum += (int)x;
	
	for (int i = 2; i < x; i++)
		if (n % i == 0)
			sum += i + (n / i);
	
	return sum + 1;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (scan.hasNextInt())
	{
	int num = scan.nextInt();
	int sum = properSum(num);
	
	System.out.print(num + " ");
	
	if (sum == num)
		System.out.println("perfect");
	else if (Math.abs(sum - num) <= 2)
		System.out.println("almost perfect");
	else
		System.out.println("not perfect");
	}

scan.close();
	}
}