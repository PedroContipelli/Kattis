import java.util.Scanner;
public class npuzzle {
	
public static int scatter(char x , int r , int c) {
	if (x == 'A')
		return Math.abs(r - 0) + Math.abs(c - 0);
	
	if (x == 'B')
		return Math.abs(r - 0) + Math.abs(c - 1);
	
	if (x == 'C')
		return Math.abs(r - 0) + Math.abs(c - 2);
	
	if (x == 'D')
		return Math.abs(r - 0) + Math.abs(c - 3);
	
	if (x == 'E')
		return Math.abs(r - 1) + Math.abs(c - 0);
	
	if (x == 'F')
		return Math.abs(r - 1) + Math.abs(c - 1);
	
	if (x == 'G')
		return Math.abs(r - 1) + Math.abs(c - 2);
	
	if (x == 'H')
		return Math.abs(r - 1) + Math.abs(c - 3);
	
	if (x == 'I')
		return Math.abs(r - 2) + Math.abs(c - 0);
	
	if (x == 'J')
		return Math.abs(r - 2) + Math.abs(c - 1);
	
	if (x == 'K')
		return Math.abs(r - 2) + Math.abs(c - 2);
	
	if (x == 'L')
		return Math.abs(r - 2) + Math.abs(c - 3);
	
	if (x == 'M')
		return Math.abs(r - 3) + Math.abs(c - 0);
	
	if (x == 'N')
		return Math.abs(r - 3) + Math.abs(c - 1);
	
	if (x == 'O')
		return Math.abs(r - 3) + Math.abs(c - 2);
	
	return -1;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int sum = 0;
String str0 = scan.next();
String str1 = scan.next();
String str2 = scan.next();
String str3 = scan.next();

for (int i = 0; i < 4; i++)
	if (str0.charAt(i) != '.')
		sum += scatter(str0.charAt(i) , 0 , i);

for (int i = 0; i < 4; i++)
	if (str1.charAt(i) != '.')
		sum += scatter(str1.charAt(i) , 1 , i);

for (int i = 0; i < 4; i++)
	if (str2.charAt(i) != '.')
		sum += scatter(str2.charAt(i) , 2 , i);

for (int i = 0; i < 4; i++)
	if (str3.charAt(i) != '.')
		sum += scatter(str3.charAt(i) , 3 , i);

System.out.println(sum);
scan.close();
	}
}