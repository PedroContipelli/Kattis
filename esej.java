public class esej {

public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int A = scan.getInt();
int B = scan.getInt();

int min = Math.max(A , (B / 2) + 1);
int count = 0;

MainLoop:
for (char a = 'a'; a <= 'z'; a++)
	for (char b = 'a'; b <= 'z'; b++)
		for (char c = 'a'; c <= 'z'; c++)
			for (char d = 'a'; d <= 'z'; d++)
				{
				scan.print("" + a + b + c + d + " ");
				
				count++;
				
				if (count == min)
					break MainLoop;
				}

scan.close();
	}
}