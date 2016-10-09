import java.util.Scanner;
import java.util.ArrayList;
public class hittingtargets {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

ArrayList<Integer> Rectangles = new ArrayList<>();
ArrayList<Integer> Circles = new ArrayList<>();

int targets = scan.nextInt();

for (int i = 0; i < targets; i++)
    {
    String str = scan.next();
    
    if (str.equals("rectangle"))
        {
        for (int z = 0; z < 4; z++)
        Rectangles.add(scan.nextInt());
        }
    if (str.equals("circle"))
        {
        for (int z = 0; z < 3; z++)
        Circles.add(scan.nextInt());
        }
    }

int testcases = scan.nextInt();

for (int i = 0; i < testcases; i++)
    {
    int x = scan.nextInt();
    int y = scan.nextInt();
    
    int shots = 0;
    
    for (int j = 0; j < Rectangles.size(); j += 4)
        if (x >= Rectangles.get(j) && y >= Rectangles.get(j+1) && x <= Rectangles.get(j+2) && y <= Rectangles.get(j+3))
            shots++;
    
    for (int j = 0; j < Circles.size(); j += 3)
        if ( Math.sqrt( (x - Circles.get(j))*(x - Circles.get(j)) + (y - Circles.get(j + 1))*(y - Circles.get(j + 1)) ) <= Circles.get(j + 2) )
            shots++;
    
    System.out.println(shots);
    }

scan.close();
    }
}