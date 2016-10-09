import java.util.Scanner;
public class pot {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int testcases = scan.nextInt();
long sum = 0;
for (int zaxbys = 0; zaxbys < testcases; zaxbys++)
	{
	int num = scan.nextInt();
	sum += Math.pow(num / 10, num % 10);
	}

System.out.println(sum);
scan.close();
	}

}
