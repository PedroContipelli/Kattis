import java.util.Scanner;
public class mixedfractions {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
{
int num = scan.nextInt();
int den = scan.nextInt();

if (num == 0 && den == 0)
	break;

System.out.println(num/den + " " + (num%den) + " / " + den);
}

scan.close();
	}

}
