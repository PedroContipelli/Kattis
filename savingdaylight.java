import java.util.Scanner;
public class savingdaylight {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (scan.hasNext())
	{
	String Date = scan.next() + " " + scan.next() + " " + scan.next();
	
	String time1 = scan.next();
	String time2 = scan.next();
	
	int hours = Integer.parseInt(time2.substring(0, time2.indexOf(":"))) - Integer.parseInt(time1.substring(0, time1.indexOf(":")));
	int minutes = Integer.parseInt(time2.substring(time2.indexOf(":") + 1)) - Integer.parseInt(time1.substring(time1.indexOf(":") + 1));
	
	if (minutes < 0)
		{
		minutes += 60;
		hours--;
		}
	
	System.out.println(Date + " " + hours + " hours " + minutes + " minutes");
	}

scan.close();
	}

}
