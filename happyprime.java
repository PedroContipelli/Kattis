import java.util.Scanner;
public class happyprime {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int testcases = scan.nextInt();

for (int zaxbys = 0; zaxbys < testcases; zaxbys++)
	{
	int num = scan.nextInt();
	int cand = scan.nextInt();
	
	System.out.print(num + " " + cand + " ");
	
	if (isPrime(cand) && isHappy(cand))
		System.out.println("YES");
	else
		System.out.println("NO");
	
	}

scan.close();
	}

public static boolean isPrime(int n) {
	for (int i = 2; i < (int)(Math.sqrt(n) + 1); i++)
		if (n % i == 0)
			return false;
	return (n != 1);
}

public static boolean isHappy(int n) {
	int sum = 0;
	String str = "";
	for (int i = 0; i < 50; i++)
		{
		str = "" + n;
		if (n == 1)
			return true;
		sum = 0;
		for (int j = 0; j < str.length(); j++)
			sum += Integer.parseInt(str.substring(j, j + 1)) * Integer.parseInt(str.substring(j, j + 1));
		n = sum;
		}
	return (n == 1);
}
}
