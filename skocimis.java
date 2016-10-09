import java.util.Scanner;
public class skocimis {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();

System.out.println(Math.max(b - a, c - b) - 1);
scan.close();
	}

}
