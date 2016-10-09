import java.util.Scanner;
public class halfacookie {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (scan.hasNextDouble())
    {
    double r = scan.nextDouble();
    double x = scan.nextDouble();
    double y = scan.nextDouble();
    
    double theta = Math.acos(Math.sqrt((x*x + y*y)) / r);
    double sector = r*r*theta;
    double triangle = (Math.sqrt(x*x + y*y)) * (Math.sqrt(r*r - x*x - y*y));
    double little = sector - triangle;
    double big = r*r*Math.PI - little;
    
    if (x*x + y*y >= r*r)
        System.out.println("miss");
    else
        {
        System.out.printf("%.4f" , big);
        System.out.print(" ");
        System.out.printf("%.4f" , little);
        System.out.println();
        }
    }
scan.close();

    }
}