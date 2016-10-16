import java.util.Arrays;
import java.util.Scanner;
public class lawnmower {
	
public static boolean check(double[] nums , double width , int length) {
	double half = width / 2;
	
	if (nums[0] - half > 0)
		return false;
	
	for (int i = 0; i < nums.length - 1; i++)
		if (nums[i] + half < nums[i + 1] - half)
			return false;
	
	if (nums[nums.length - 1] + half < length)
		return false;
	
	return true;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
	{
	int nx = scan.nextInt();
	int ny = scan.nextInt();
	double width = scan.nextDouble();
	
	if (nx == 0 && ny == 0 && width == 0.0)
		break;
	
	double[] numsA = new double[nx];
	
	for (int i = 0; i < nx; i++)
		numsA[i] = scan.nextDouble();
	
	double[] numsB = new double[ny];
	
	for (int i = 0; i < ny; i++)
		numsB[i] = scan.nextDouble();
	
	Arrays.sort(numsA);
	Arrays.sort(numsB);
	
	System.out.println(check(numsA , width , 75) && check(numsB , width , 100) ? "YES" : "NO");
	}

scan.close();
	}
}