import java.util.Scanner;
public class speedlimit {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
    {
    int sum = 0;
    int cases = scan.nextInt();
    
    if (cases == -1)
        break;
    
    int[] nums = new int[cases * 2];
    
    for (int i = 0; i < nums.length; i++)
        nums[i] = scan.nextInt();
    
    for (int i = 0; i < nums.length; i += 2)
        {
        if (i == 0)
            sum += nums[i] * nums[i + 1];
        else
            sum += nums[i] * (nums[i + 1] - nums[i - 1]);
        }
    
    System.out.println(sum + " miles");
    }

scan.close();
    }
}