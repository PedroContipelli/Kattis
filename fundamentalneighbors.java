import java.util.*;
public class fundamentalneighbors {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (scan.hasNextInt())
    {
    int N = scan.nextInt();
    
    System.out.print(N + " ");
    
    int num = 1;
     
    int sqrt = (int)Math.ceil(Math.sqrt(N));
    
    for (int i = 2; i <= sqrt; i++)
        {
        int count = 0;
        
        while (N % i == 0)
            {
            N /= i;
            count++;
            }
        
        if (count > 0)
            num *= (int)Math.pow(count , i);
        }
    
    System.out.println(num);
    }


scan.close();
    }
}