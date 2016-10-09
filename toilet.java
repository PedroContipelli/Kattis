import java.util.Scanner;
public class toilet {
	
public static int up(String str) {
	
	int count = 0;
	boolean up = false;
	
	if (str.charAt(0) == 'U')
		up = true;
	
	for (int i = 1; i < str.length(); i++)
		{
		char want = str.charAt(i);
		
		if (want == 'D' && up)
			{
			up = false;
			count++;
			}
		
		if (!up)
			{
			up = true;
			count++;
			}
		}
	
	return count;
	
}

public static int down(String str) {
	
	int count = 0;
	boolean up = false;
	
	if (str.charAt(0) == 'U')
		up = true;
	
	for (int i = 1; i < str.length(); i++)
		{
		char want = str.charAt(i);
		
		if (want == 'U' && !up)
			{
			up = true;
			count++;
			}
		
		if (up)
			{
			up = false;
			count++;
			}
		}
	
	return count;
	
}

public static int like(String str) {
	
	int count = 0;
	boolean up = false;
	
	if (str.charAt(0) == 'U')
		up = true;
	
	for (int i = 1; i < str.length(); i++)
		{
		char want = str.charAt(i);
		
		if (want == 'U' && !up)
			{
			up = true;
			count++;
			}
		
		if (want == 'D' && up)
			{
			up = false;
			count++;
			}
		
		}
	
	return count;
	
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String str = scan.nextLine();
System.out.println(up(str));
System.out.println(down(str));
System.out.println(like(str));

scan.close();
}
}