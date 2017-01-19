import java.util.*;
public class bazen {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int x = scan.nextInt();
int y = scan.nextInt();
int temp;
boolean rotated = false;

double xf , yf , b;

if (! (x == 0 || y == 0))
    {
    if (y >= x)
        {
        b = 31250.0 / y;
        xf = 250 - b; yf = 0;
        }
    else
        {
        b = 31250.0 / x;
        yf = 250 - b; xf = 0;
        }
    }
else
    {
    if (x == 0)
        {
        temp = x;
        x = y;
        y = temp;
        rotated = true;
        }
    
    if (x <= 125)
        {
        b = 250 - x;
        yf = 31250.0 / b;
        xf = 250 - yf;
        }
    else
        {
        b = x;
        yf = 31250.0 / b;
        xf = 0;
        }
    
    if (rotated)
        {
        b = xf;
        xf = yf;
        yf = b;
        }
    }

System.out.printf("%.2f" , xf);
System.out.print(" ");
System.out.printf("%.2f" , yf);

scan.close();
    }
}