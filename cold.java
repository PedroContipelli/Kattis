import java.util.Scanner;
public class cold {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();
int count = 0;

for (int zaxby = 0; zaxby < cases; zaxby++)
	{
	int x = scan.nextInt();
	if (x < 0)
		count++;
	}

System.out.println(count);

scan.close();
	}

}