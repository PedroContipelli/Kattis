import java.util.Scanner;
public class doorman {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int diff = scan.nextInt();
String str = scan.next();

int men = 0;
int women = 0;

while (true)
	{
	boolean hit = false;
	
	if (Math.abs((men + 1) - women) <= diff)
		{
		if (str.length() > 0 && str.charAt(0) == 'M')
			{
			str = str.substring(1);
			men++;
			hit = true;
			}
		else if (str.length() > 1 && str.charAt(1) == 'M')
			{
			str = str.substring(0,1) + str.substring(2);
			men++;
			hit = true;
			}
		}
	
	if (!hit && Math.abs(men - (women + 1)) <= diff)
		{
		if (str.length() > 0 && str.charAt(0) == 'W')
			{
			str = str.substring(1);
			women++;
			hit = true;
			}
		else if (str.length() > 1 && str.charAt(1) == 'W')
			{
			str = str.substring(0,1) + str.substring(2);
			women++;
			hit = true;
			}
		}
	
	if (!hit || str.isEmpty())
		break;
	}

	System.out.println(men + women);
	scan.close();
	}

}
