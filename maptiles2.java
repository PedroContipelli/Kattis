import java.util.Scanner;
public class maptiles2 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String str = scan.next();
int zoom = str.length();
int x = 0;
int y = 0;

for (int i = 0; i < zoom; i++)
	{
	int current = Integer.valueOf(str.substring(i , i + 1));
	
	if (current == 1 || current == 3)
	x += (int)Math.pow(2, zoom - i - 1);
	
	if (current == 2 || current == 3)
	y += (int)Math.pow(2, zoom - i - 1);
	}

System.out.println(zoom + " " + x + " " + y);
scan.close();
	}

}
