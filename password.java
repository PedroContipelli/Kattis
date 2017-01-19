import java.util.*;
public class password {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int n = scan.nextInt();
double[] nums = new double[n];

for (int i = 0; i < n; i++)
    {
    scan.next();
    nums[i] = scan.nextDouble();
    }

Arrays.sort(nums);

double sum = 0;

for (int i = n - 1; i >= 0; i--)
    sum += (n - i) * nums[i];

System.out.println(sum);

scan.close();
    }
}
