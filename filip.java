import java.util.*;
public class filip {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String num1 = new String(new StringBuilder(scan.next()).reverse());
String num2 = new String(new StringBuilder(scan.next()).reverse());

int a = Integer.parseInt(num1);
int b = Integer.parseInt(num2);

System.out.println(a > b ? a : b);

scan.close();
	}
}