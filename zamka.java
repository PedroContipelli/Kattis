import java.util.Scanner;
public class zamka {

public static int sumDigits(int in) {
    int sum = 0;
    while (in != 0)
        {
        sum += (in % 10);
        in /= 10;
        }
    
    return sum;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int L = scan.nextInt();
int D = scan.nextInt();
int X = scan.nextInt();

int min = 0;
int max = 0;

for (int i = L; i <= D; i++)
    {
        if (sumDigits(i) == X)
            {
            min = i;
            break;
            }
    }

for (int i = D; i >= L; i--)
    {
        if (sumDigits(i) == X)
            {
            max = i;
            break;
            }
    }

System.out.println(min);
System.out.println(max);

scan.close();
    }
}