import java.util.Scanner;
public class sumoftheothers {

public static boolean check(int index , int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++)
        if (i != index)
            sum += nums[i];
    return sum == nums[index];
}
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (scan.hasNextLine())
    {
    String str = scan.nextLine();
    
    String[] copy = str.split(" ");
    int[] nums = new int[copy.length];
    
    for (int i = 0; i < copy.length; i++)
        nums[i] = Integer.parseInt(copy[i]);
    
    for (int i = 0; i < nums.length; i++)
        if (check(i , nums))
            {
            System.out.println(nums[i]);
            break;
            }
        
    }

scan.close();
    }
}