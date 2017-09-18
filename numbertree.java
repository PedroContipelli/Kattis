import java.util.*;
public class numbertree {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int height = scan.nextInt();
long numTop = (long)(Math.pow(2 , height + 1) - 1);

long subtract = 0;
    
if (scan.hasNext())
    {
    char[] path = scan.next().toCharArray();
    
    for (char x : path)
    	{
        if (x == 'L')
        	subtract = (2 * subtract) + 1;
        else
        	subtract = (2 * subtract) + 2;
    	}
    }

System.out.println(numTop - subtract);
    
scan.close();
    }
}