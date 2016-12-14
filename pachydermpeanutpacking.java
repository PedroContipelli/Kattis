import java.util.Scanner;
public class pachydermpeanutpacking {
	
public static String inBox(double x , double y , Box[] boxes) {
	for (Box box : boxes)
		if (x >= box.x1 && x <= box.x2 && y >= box.y1 && y <= box.y2)
			return box.size;
	
	return "floor";
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
	{
	int n = scan.nextInt();
	
	if (n == 0)
		break;
	
	Box[] boxes = new Box[n];
	
	for (int i = 0; i < boxes.length; i++)
		boxes[i] = new Box(scan.nextDouble() , scan.nextDouble() , scan.nextDouble() , scan.nextDouble() , scan.next());
	
	int m = scan.nextInt();
	
	for (int i = 0; i < m; i++)
		{
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		String size = scan.next();
		String inBox = inBox(x , y , boxes);
		
		System.out.println(size + " " + (inBox.equals(size) ? "correct" : inBox));
		}
	
	System.out.println();
	}

scan.close();
	}
}

class Box {
	
String size;
double x1 , y1 , x2 , y2;

public Box(double a , double b , double c , double d , String size) {
	this.size = size;
	x1 = a;
	y1 = b;
	x2 = c;
	y2 = d;
}

}