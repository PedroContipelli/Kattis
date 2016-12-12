public class esej {
	
public static char x(int n) {
	return (char)('a' + n);
}

public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int a = scan.getInt();
int b = scan.getInt();

int min = b % 2 == 0 ? b / 2 : b / 2 + 1;

if (a > min)
	min = a;

int count = 0;

big: for (int i = 0; i < 26; i++)
	for (int j = 0; j < 26; j++)
		for (int k = 0; k < 26; k++)
			for (int l = 0; l < 26; l++)
				{
				scan.print("" + x(i) + x(j) + x(k) + x(l) + " ");
				count++;
				
				if (count == min)
					break big;
				}

scan.close();
	}
}