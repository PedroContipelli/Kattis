import java.util.*;
public class standings {
static int min;

public static long eval(int[] x) {
    
    long sum = 0;
    
    for (int i = 0; i < x.length; i++)
        sum += Math.abs(x[i] - (i + 1));
    
    return sum;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

while (cases --> 0)
    {
    min = Integer.MAX_VALUE;
    int teams = scan.nextInt();
    int[] places = new int[teams];
    
    for (int i = 0; i < places.length; i++)
        {
        scan.next();
        places[i] = scan.nextInt();
        }
    
    Arrays.sort(places);
    long sum = eval(places);
    
    System.out.println(sum);
    }

scan.close();
    }
}