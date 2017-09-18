import java.util.*;
public class simplicity {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String alpha = "abcdefghijklmnopqrstuvwxyz";
int[] nums = new int[26]; 

String str = scan.next();

for (int i = 0; i < str.length(); i++)
	nums[alpha.indexOf(str.charAt(i))]++;

Arrays.sort(nums);

int sum = 0;

for (int i = 0; i < nums.length - 2; i++)
	sum += nums[i];

System.out.println(sum);

scan.close();
	}
}