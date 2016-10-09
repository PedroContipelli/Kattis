import java.util.Scanner;
public class eligibility {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

for (int zaxby = 0; zaxby < cases; zaxby++)
	{
	String name = scan.next();
	String STU = scan.next();
	String DOB = scan.next();
	int courses = scan.nextInt();
	int eligibility = 0;
	
	if (Integer.parseInt(STU.substring(0,4)) >= 2010)
		eligibility = 1;
	else if (Integer.parseInt(DOB.substring(0,4)) >= 1991)
		eligibility = 1;
	else if (courses > 40)
		eligibility = 0;
	else
		eligibility = 2;
	
	System.out.print(name + " ");
	if (eligibility == 0)
		System.out.println("ineligible");
	else if (eligibility == 1)
		System.out.println("eligible");
	else
		System.out.println("coach petitions");
	}


scan.close();
	}

}