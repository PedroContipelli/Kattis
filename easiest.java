import java.util.Scanner;
public class easiest {
	
public static int digits(int n) {
	int sum = 0;
	while (n != 0)
		{
		sum += n % 10;
		n /= 10;
		}
	return sum;
}
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
	{
	int a = scan.nextInt();
	if (a == 0)
		break;
	
	int i = 11;
		while (digits(a) != digits(a * i))
			i++;
	
	System.out.println(i);
	}


scan.close();
	}

}
