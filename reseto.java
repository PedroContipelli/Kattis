import java.util.*;
public class reseto {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int N = scan.nextInt();
int K = scan.nextInt();

boolean[] nums = new boolean[N + 1];

nums[0] = true;
nums[1] = true;

int i = 0;
boolean found = false;

while (!found)
    {
    for (i = 0; i < nums.length; i++)
        if (!nums[i])
            break;
    
    for (int m = i; m < nums.length; m += i)
        {
        if (!nums[m])
            {
            nums[m] = true;
            K--;
            }
        
        if (K == 0)
            {
            found = true;
            System.out.println(m);
            break;
            }
        }
    }

scan.close();
    }
}