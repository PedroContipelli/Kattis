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

public static String reverse(String str) {
	String build = "";
	
	for (int i = str.length() - 1; i >= 0; i--)
		build += str.charAt(i);
	
	return build;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
	{
	int instructions = scan.nextInt();
	
	if (instructions == 0)
		break;
	
	char[] bits = "????????????????????????????????".toCharArray();
	
	for (int zax = 0; zax < instructions; zax++)
		{
		String oper = scan.next();
		
		if (oper.equals("CLEAR"))
			bits[scan.nextInt()] = '0';
		
		else if (oper.equals("SET"))
			bits[scan.nextInt()] = '1';
		
		else if (oper.equals("OR"))
			{
			int i = scan.nextInt();
			int j = scan.nextInt();
			
			bits[i] = OR(bits[i] , bits[j]);
			}
		
		else if (oper.equals("AND"))
			{
			int i = scan.nextInt();
			int j = scan.nextInt();
			
			bits[i] = AND(bits[i] , bits[j]);
			}
		}
	
	System.out.println(reverse(new String(bits)));
	}

	scan.close();
	}
}