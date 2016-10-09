import java.util.Scanner;
public class twostones {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int x = scan.nextInt();
System.out.println(x % 2 == 0 ? "Bob" : "Alice");
scan.close();
	}
}