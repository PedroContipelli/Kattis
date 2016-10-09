import java.util.Scanner;
public class display {
	
public static String printer(int num , int line) {
String[] zer = {"+---+",
				"|   |",
				"|   |",
				"+   +",
				"|   |",
				"|   |",
				"+---+",};

String[] one = {"    +",
				"    |",
				"    |",
				"    +",
				"    |",
				"    |",
				"    +",};

String[] two = {"+---+",
				"    |",
				"    |",
				"+---+",
				"|    ",
				"|    ",
				"+---+",};

String[] thr = {"+---+",
				"    |",
				"    |",
				"+---+",
				"    |",
				"    |",
				"+---+",};

String[] fou = {"+   +",
				"|   |",
				"|   |",
				"+---+",
				"    |",
				"    |",
				"    +",};

String[] fiv = {"+---+",
				"|    ",
				"|    ",
				"+---+",
				"    |",
				"    |",
				"+---+",};

String[] six = {"+---+",
				"|    ",
				"|    ",
				"+---+",
				"|   |",
				"|   |",
				"+---+",};

String[] sev = {"+---+",
				"    |",
				"    |",
				"    +",
				"    |",
				"    |",
				"    +",};

String[] eig = {"+---+",
				"|   |",
				"|   |",
				"+---+",
				"|   |",
				"|   |",
				"+---+",};

String[] nin = {"+---+",
				"|   |",
				"|   |",
				"+---+",
				"    |",
				"    |",
				"+---+",};

if (num == 0)
	return zer[line];
if (num == 1)
	return one[line];
if (num == 2)
	return two[line];
if (num == 3)
	return thr[line];
if (num == 4)
	return fou[line];
if (num == 5)
	return fiv[line];
if (num == 6)
	return six[line];
if (num == 7)
	return sev[line];
if (num == 8)
	return eig[line];

return nin[line];

}
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
	{
	String time = scan.next();
	
	if (time.equals("end"))
		break;
	
	int num1 = Integer.parseInt(time.substring(0 , 1));
	int num2 = Integer.parseInt(time.substring(1 , 2));
	int num3 = Integer.parseInt(time.substring(3 , 4));
	int num4 = Integer.parseInt(time.substring(4 , 5));
	
	System.out.println(printer(num1 , 0) + "  " + printer(num2 , 0) + "     " + printer(num3 , 0) + "  " + printer(num4 , 0));
	System.out.println(printer(num1 , 1) + "  " + printer(num2 , 1) + "     " + printer(num3 , 1) + "  " + printer(num4 , 1));
	System.out.println(printer(num1 , 2) + "  " + printer(num2 , 2) + "  o  " + printer(num3 , 2) + "  " + printer(num4 , 2));
	System.out.println(printer(num1 , 3) + "  " + printer(num2 , 3) + "     " + printer(num3 , 3) + "  " + printer(num4 , 3));
	System.out.println(printer(num1 , 4) + "  " + printer(num2 , 4) + "  o  " + printer(num3 , 4) + "  " + printer(num4 , 4));
	System.out.println(printer(num1 , 5) + "  " + printer(num2 , 5) + "     " + printer(num3 , 5) + "  " + printer(num4 , 5));
	System.out.println(printer(num1 , 6) + "  " + printer(num2 , 6) + "     " + printer(num3 , 6) + "  " + printer(num4 , 6));
	System.out.println();
	System.out.println();
	}		

System.out.println("end");
scan.close();
	}
}