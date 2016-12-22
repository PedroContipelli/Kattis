import java.util.Scanner;
public class welcomeeasy {
	
static long count = 0;
static char[] code = "welcome to code jam".toCharArray();

public static void run(String str , int letter , int index) {

	if (letter == code.length)
		{
		count++;
		return;
		}
	
	for (int i = index; i < str.length(); i++)
		if (code[letter] == str.charAt(i))
			run(str , letter + 1 , i + 1);
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();
scan.nextLine();

for (int z = 1; z <= cases; z++)
	{
	count = 0;
	
	String msg = scan.nextLine();
	
	run(msg , 0 , 0);
	
	String counter = "0000" + count;
	counter = counter.substring(counter.length() - 4);
	
	System.out.println("Case #" + z + ": " + counter);
	}

scan.close();
	}
}