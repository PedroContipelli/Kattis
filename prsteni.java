import java.util.Scanner;
public class prsteni {
    
public static int GCF(int num1 , int num2) {

    for (int i = Math.min(num1, num2); i >= 1; i--)
        if (num1 % i == 0 && num2 % i == 0)
            return i;
    
    return 0;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int rings = scan.nextInt();
int[] nums = new int[rings];

for (int i = 0; i < nums.length; i++)
    {
    int in = scan.nextInt();
    nums[i] = in + in;
    }

for (int i = 1; i < nums.length; i++)
    {
    int num = nums[0];
    int den = nums[i];
    
    int GCF = GCF(num , den);
    
    num /= GCF;
    den /= GCF;
    
    System.out.println(num + "/" + den);
    }

scan.close();
	}
}