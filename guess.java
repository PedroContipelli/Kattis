import java.util.Scanner;
public class guess {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int LowerBound = 1;
int UpperBound = 1000;
int X = (LowerBound + UpperBound) / 2;
System.out.println(X);

while (true)
	{
	String input = scan.nextLine();
	
	if (input.equals("higher"))
		{
		LowerBound = X;
		X = (LowerBound + UpperBound + 1) / 2;
		}
	
	if (input.equals("lower"))
		{
		UpperBound = X;
		X = (LowerBound + UpperBound) / 2;
		}
	
	if (input.equals("correct"))
		break;
	
	System.out.println(X);
	}

scan.close();
	}
}