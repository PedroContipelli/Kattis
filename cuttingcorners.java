import java.util.*;
public class cuttingcorners {
    
public static double angleVector(double x1 , double y1 , double x2 , double y2) {

    return Math.acos( (x1*x2 + y1*y2) / (Math.hypot(x1 , y1) * Math.hypot(x2 , y2)) );
}

public static void update(ArrayList<Corner> c ,  ArrayList<Double> angles) {
    
    angles.clear();
    
    angles.add(anglePoints(c.get(c.size() - 1) , c.get(0) , c.get(1)));
    
    for (int i = 1; i < c.size(); i++)
        angles.add(anglePoints(c.get(i - 1) , c.get(i) , c.get((i + 1) % c.size())));
}

public static double anglePoints(Corner a , Corner b , Corner c) {
    int x1 = a.x;
    int y1 = a.y;
    int x2 = b.x;
    int y2 = b.y;
    int x3 = c.x;
    int y3 = c.y;
    
    x1 -= x2;
    x3 -= x2;
    y1 -= y2;
    y3 -= y2;
    
    return angleVector(x1 , y1 , x3 , y3);
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
    {
    int n = scan.nextInt();
    
    if (n == 0)
        break;
    
    ArrayList<Corner> c = new ArrayList<>(n);
    
    for (int i = 0; i < n; i++)
        c.add(new Corner(scan.nextInt() , scan.nextInt()));
    
    ArrayList<Double> angles = new ArrayList<>(n);
    
    update(c , angles);
    
    double uniMin = 0;
    Corner lastRemoved = new Corner(0 , 0);
    int lastMinIndex = 0;
    
    while (true)
        {       
        double min = Double.MAX_VALUE;
        int minIndex = 0;
        
        for (int i = 0; i < angles.size(); i++)
            if (angles.get(i) < min)
                {
                min = angles.get(i);
                minIndex = i;
                }
        
        if (min < uniMin)
            {
            c.add(lastMinIndex , lastRemoved);
            break;
            }
        
        if (angles.size() == 3)
            break;
        
        lastRemoved = c.remove(minIndex);
        uniMin = min;
        lastMinIndex = minIndex;
        
        update(c , angles);
        }
    
    System.out.println(c.size() + " " + c.toString().substring(1 , c.toString().length() - 1).replace("," , ""));
    }

scan.close();
    }
}

class Corner {
    
int x , y;

public Corner(int a , int b) {
    x = a;
    y = b;
}

public String toString() {
    return x + " " + y;
}

}