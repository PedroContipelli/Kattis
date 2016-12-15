import java.util.Scanner;
public class permutationencryption {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
	{
	int keyLength = scan.nextInt();
	
	if (keyLength == 0)
		break;
	
	int[] start = new int[keyLength];
	
	for (int i = 0; i < keyLength; i++)
		start[i] = scan.nextInt();
	
	scan.nextLine();
	String message = scan.nextLine();
	
	while (message.length() % keyLength != 0)
		message += " ";
	
	char[] encrypted = new char[message.length()];
	
	for (int i = 0; i < encrypted.length; i++)
		{
		encrypted[i] = message.charAt(start[i % keyLength] - 1);
		start[i % keyLength] += keyLength;
		}
	
	System.out.println("'" + new String(encrypted) + "'");
	}

scan.close();
	}
}