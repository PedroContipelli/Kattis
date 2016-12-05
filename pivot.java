import java.util.Scanner;
public class pivot {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int n = scan.nextInt();

int[] nums = new int[n];

for (int i = 0; i < nums.length; i++)
  nums[i] = scan.nextInt();
  
int[] mins = new int[n];
int[] maxs = new int[n];
  
mins[n - 1] = nums[n - 1];
maxs[0] = nums[0];

for (int i = nums.length - 2; i >= 0; i--)
  mins[i] = Math.min(nums[i] , mins[i + 1]);
  
for (int i = 1; i < nums.length; i++)
  maxs[i] = Math.max(nums[i] , maxs[i - 1]);
  
int count = 0;

for (int i = 0; i < nums.length; i++)
  if ((i == 0 || nums[i] > maxs[i - 1]) && (i == nums.length - 1 || nums[i] < mins[i + 1]))
    count++;
    
System.out.println(count);

scan.close();
  }
}