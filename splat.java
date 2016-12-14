public class splat {
public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int cases = scan.getInt();

while (cases --> 0)
    {
    int circles = scan.getInt();
    Circle[] C = new Circle[circles];
    
    for (int i = 0; i < C.length; i++)
        C[i] = new Circle(scan.getDouble() , scan.getDouble() , scan.getDouble() , scan.getWord());
    
    int points = scan.getInt();
    
    for (int p = 0; p < points; p++)
        {
        
        double x = scan.getDouble();
        double y = scan.getDouble();
        
        boolean painted = false;
        
        for (int i = C.length - 1; i >= 0; i--)
            if (C[i].inside(x , y))
                {
                System.out.println(C[i].color);
                painted = true;
                break;
                }
        
        if (!painted)
            System.out.println("white");
        }
    }

scan.close();
    }
}

class Circle {
    double x , y , radius;
    String color;
    
    public Circle(double x , double y , double volume , String color) {
        
        this.x = x;
        this.y = y;
        radius = Math.sqrt(volume / Math.PI);
        this.color = color;
    }
    
    public boolean inside(double x , double y) {
        return Math.hypot(this.x - x , this.y - y) <= radius;
    }
}