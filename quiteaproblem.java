import java.util.*;
public class quiteaproblem {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while(scan.hasNextLine())
	{
	String line = scan.nextLine();
	line = line.toLowerCase();
	
	System.out.println(line.contains("problem") ? "yes" : "no");
	}

scan.close();
	}
}