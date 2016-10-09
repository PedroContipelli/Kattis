import java.util.Scanner;
public class compass {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int from = scan.nextInt();
int to = scan.nextInt();

int cw = 0;
int ccw = 0;

if (to >= from)
	{
	cw = to - from;
	ccw = 0 - from - (360 - to);
	}
else
	{
	cw = (360 - from) + to;
	ccw = -(from - to);
	}

System.out.println(Math.abs(cw) <= Math.abs(ccw) ? cw : ccw);
scan.close();
	}
}