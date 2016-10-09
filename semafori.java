import java.util.Scanner;
public class semafori {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();
int length = scan.nextInt();
int seconds = 0;
int position = 0;

for (int zax = 0; zax < cases; zax++)
	{
	
	int light = scan.nextInt();
	int red   = scan.nextInt();
	int green = scan.nextInt();
	
	seconds += light - position;
	position = light;
	
	if (seconds % (red + green) < red)
		seconds += red - (seconds % (red + green));
	
	}

seconds += length - position;

System.out.println(seconds);
scan.close();
	}
}