import java.util.*;
public class loworderzeros {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int[] nums = new int[1000001];

long fac = 1;

for (int i = 1; i < nums.length; i++)
    {
    fac *= i;
    
    while (fac % 10 == 0)
        fac /= 10;
    
    nums[i] = (int)(fac % 10);
    fac %= 10000000;
    }

while (true)
    {
    int n = scan.nextInt();
    
    if (n == 0)
        break;
    
    System.out.println(nums[n]);
    }

scan.close();
    }
}