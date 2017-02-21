public class pachydermpeanutpacking {
    
public static String inBox(double x , double y , Box[] boxes) {
    for (Box box : boxes)
        if (x >= box.x1 && x <= box.x2 && y >= box.y1 && y <= box.y2)
            return box.size;
    
    return "floor";
}

public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

while (true)
    {
    int n = scan.getInt();
    
    if (n == 0)
        break;
    
    Box[] boxes = new Box[n];
    
    for (int i = 0; i < boxes.length; i++)
        boxes[i] = new Box(scan.getDouble() , scan.getDouble() , scan.getDouble() , scan.getDouble() , scan.getWord());
    
    int m = scan.getInt();
    
    for (int i = 0; i < m; i++)
        {
        double x = scan.getDouble();
        double y = scan.getDouble();
        
        String size = scan.getWord();
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