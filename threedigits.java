import java.util.Scanner;
public class threedigits {

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int num = scan.nextInt();
int x = num;
int twos = 0;
int fives = 0;

while (x > 0)
    {
    x /= 5;
    fives += x;
    }

twos = fives;

long fac = 1;

for (int z = 1; z <= num; z++)
    {
    int i = z;
    
    while (i % 2 == 0 && twos > 0)
        {
        i /= 2;
        twos--;
        }
    
    while (i % 5 == 0 && fives > 0)
        {
        i /= 5;
        fives--;
        }
        
    fac *= i;
    fac %= 1000;
    }

String num2 = (num < 7 ? "   " : "000") + fac;
System.out.println(num2.substring(num2.length() - 3).trim());

scan.close();
    }
}