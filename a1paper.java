import java.util.Scanner;
public class a1paper {
	
public static boolean possible(int[] nums , int pow2) {
	int sum = 0;
	int high = pow2;
	
	for (int i = 0; i < nums.length; i++)
		{
		pow2 /= 2;
		sum += pow2 * nums[i];
		
		if (sum >= high)
			return true;
		}
	
	return false;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int Asize = scan.nextInt() - 1;
int pow2 = (int)Math.pow(2, Asize);

int[] paper = new int[Asize];

for (int i = 0; i < paper.length; i++)
	paper[i] = scan.nextInt();

if (possible(paper , pow2))
	{
	int sum = 0;
	int high = pow2;
	int index = 0;
	
	for (int i = 0; i < paper.length; i++)
		{
		pow2 /= 2;
		sum += pow2 * paper[i];
		
		if (sum >= high)
			{
			index = i;
			int sub = sum - high;
			paper[index] -= sub;
			break;
			}
		}
	
	int[] a = new int[index + 1];
	
	for (int i = 0; i < index + 1; i++)
		a[i] = paper[i];
	
	double length = 0;
	double constant = Math.pow(2 , -((2 * index + 3.0) / 4));
	double root2 = Math.sqrt(2);
	
	for (int i = index; i >= 0; i--)
		{
		length += (a[i] / 2) * constant;
		
		if (i == 0)
			break;
		
		a[i - 1] += a[i] / 2;
		constant *= root2;
		}
	
	System.out.printf("%.6f" , length);
	}
else
	System.out.println("impossible");

scan.close();
	}
}
