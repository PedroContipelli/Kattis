import java.util.Scanner;
public class volim {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int box = scan.nextInt();
int moves = scan.nextInt();
int time = 210;
boolean first = true;

for (int i = 0; i < moves; i++)
	{
	time -= scan.nextInt();
	
	if (time <= 0 && first)
		{
		System.out.println(box);
		first = false;
		}
	
	String str = scan.next();
	
	if (str.equals("T"))
		{
		box++;
		if (box == 9)
			box = 1;
		}
	}

scan.close();
	}

}
