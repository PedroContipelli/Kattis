import java.util.Scanner;
public class bitbybit {
	
public static char OR(char a , char b) {
	if (a == '1' || b == '1')
		return '1';
	
	if (a == '?' || b == '?')
		return '?';
	
	return '0';
}

public static char AND(char a , char b) {
	if (a == '0' || b == '0')
		return '0';
	
	if (a == '?' || b == '?')
		return '?';
				
	return '1';
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
	{
	int instructions = scan.nextInt();
	
	if (instructions == 0)
		break;
	
	char[] bits = "????????????????????????????????".toCharArray();
	
	while (instructions --> 0)
		{
		String op = scan.next();
		
		if (op.equals("CLEAR"))
			bits[scan.nextInt()] = '0';
		
		else if (op.equals("SET"))
			bits[scan.nextInt()] = '1';
		
		else if (op.equals("OR"))
			{
			int i = scan.nextInt();
			int j = scan.nextInt();
			
			bits[i] = OR(bits[i] , bits[j]);
			}
		
		else if (op.equals("AND"))
			{
			int i = scan.nextInt();
			int j = scan.nextInt();
			
			bits[i] = AND(bits[i] , bits[j]);
			}
		}
	
	System.out.println(new StringBuilder(new String(bits)).reverse());
	}

	scan.close();
	}
}