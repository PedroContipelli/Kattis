import java.util.Scanner;
public class friday {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int testcases = scan.nextInt();

for (int zaxby = 0; zaxby < testcases; zaxby++)
    {
    int months = scan.nextInt();
    int[] nums = new int[months];
    int lucky = 0;
    int day = 0;
    
    for (int i = 0; i < months; i++)
        nums[i] = scan.nextInt();
    
    // 1 2 3 4 5 |6| 7
        
    for (int i = 0; i < months; i++)
        for (int j = 1; j <= nums[i]; j++)
            {
            day++;
            
            if (j == 13 && (day % 7) == 6)
                lucky++;
            }
    
    System.out.println(lucky);
    }

scan.close();
    }
}