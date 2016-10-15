import java.util.Scanner;
public class bits {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

for (int z = 0; z < cases; z++)
    {
    String num = scan.next();
    int max = 0;
    
    for (int i = 1; i <= num.length(); i++)
        {
    	int current = Integer.bitCount(Integer.parseInt(num.substring(0 , i)));
    	
        if (current > max)
        	max = current;
        }
            
    System.out.println(max);
    }

scan.close();
    }
}