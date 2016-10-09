import java.util.Scanner;
public class base2palindrome {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int num = scan.nextInt() + 1;
int length = 0;
int pow2 = 1;

while (pow2 <= num)
	pow2 *= 2;

pow2 /= 2;

int iter = num - pow2;

if (iter < pow2 / 2)
	length = 2 * (int)(Math.log(num) / Math.log(2)) - 1;
else
	length = 2 * (int)(Math.log(num) / Math.log(2));

boolean[] pal = new boolean[length];
pal[0] = true;
pal[pal.length - 1] = true;

if (length % 2 == 1)
	{
	int mid = length / 2;
	int i = 0;
	for (int zax = 0; zax < iter; zax++)
		{
		i = 0;
		
		while (pal[mid + i])
			i++;
		
		pal[mid + i] = true;
		pal[mid - i] = true;
		
		for (int z = mid - i + 1; z < mid + i; z++)
			pal[z] = false;
		}
	}
else
	{
	int mid = length / 2;
	int i = 0;
	
	for (int zax = 0; zax < iter - (pow2 / 2); zax++)
		{
		i = 0;
		
		while (pal[mid + i])
			i++;
		
		pal[mid + i] = true;
		pal[mid - i - 1] = true;
		
		for (int z = mid - i; z < mid + i; z++)
			pal[z] = false;
		}
	}

String bin = "";

for (int i = 0; i < pal.length; i++)
	if (pal[i])
		bin += "1";
	else
		bin += "0";

System.out.println(Integer.parseInt(bin , 2));
scan.close();
	}
}

/*
import java.util.Scanner;
public class base2palindrome {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int generate = scan.nextInt();
int fin = generate;

for (int i = 1; generate > 0; i++)
	{
	String binary = Integer.toBinaryString(i);
	
	String binary1 = Integer.toBinaryString(Integer.reverse(i));
	
	while (binary1.length() < 32)
		binary1 = '0' + binary1;
	
	binary1 = binary1.substring(0, binary.length());
	
	if (binary.equals(binary1))
		{
		generate--;
		System.out.println(i + "   :   " + binary + " " + binary1 + "      " + binary.length() + "   " + (fin - generate));
		}
	}

scan.close();
	}
}
*/