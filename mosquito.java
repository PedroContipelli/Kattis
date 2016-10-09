import java.util.Scanner;
public class mosquito {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (scan.hasNextInt())
{
int M = scan.nextInt();
int P = scan.nextInt();
int L = scan.nextInt();

int E = scan.nextInt();
int R = scan.nextInt();
int S = scan.nextInt();
int N = scan.nextInt();

for (int i = 0; i < N; i++)
	{
	int oldM = M;
	int oldP = P;
	int oldL = L;
	
	L = oldM * E;
	P = oldL / R;
	M = oldP / S;
	}

System.out.println(M);
}

scan.close();
	}

}