import java.util.Scanner;
public class beekeeper {
	
public static int count(String str) {
	int sum = 0;
	
	for (int i = 0; i < str.length() - 1; i++)
		{
		if (str.substring(i , i + 2).equals("aa"))
			sum++;
		if (str.substring(i , i + 2).equals("ee"))
			sum++;
		if (str.substring(i , i + 2).equals("ii"))
			sum++;
		if (str.substring(i , i + 2).equals("oo"))
			sum++;
		if (str.substring(i , i + 2).equals("uu"))
			sum++;
		if (str.substring(i , i + 2).equals("yy"))
			sum++;
		}
	
	return sum;
}
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
	{
	int n = scan.nextInt();
	
	if (n == 0)
		break;
	
	String[] words = new String[n];
	
	for (int i = 0; i < n; i++)
		words[i] = scan.next();
	
	int max = -1;
	String fav = "";
	
	for (int i = 0; i < n; i++)
		if (count(words[i]) > max)
			{
			fav = words[i];
			max = count(words[i]);
			}
	
	System.out.println(fav);
	}

scan.close();
	}
}