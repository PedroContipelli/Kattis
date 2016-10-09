import java.util.Scanner;
public class carrots {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int a = scan.nextInt();
int b = scan.nextInt();
scan.nextLine();

for (int i = 0; i < a; i++)
    scan.nextLine();

System.out.println(b);
scan.close();

    }
}