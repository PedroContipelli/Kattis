import java.util.Scanner;
public class rijeci {

public static int countA(String str) {
	int sum = 0;
	for (int i = 0; i < str.length(); i++)
		if (str.charAt(i) == 'A')
			sum++;
	return sum;
}
public static int countB(String str) {
	int sum = 0;
	for (int i = 0; i < str.length(); i++)
		if (str.charAt(i) == 'B')
			sum++;
	return sum;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int n = scan.nextInt();
int[] nums = new int[45];
nums[0] = 1;
nums[1] = 1;

for (int i = 2; i < nums.length; i++)
	nums[i] = nums[i - 1] + nums[i - 2];

if (n < 10)
{
String str = "A";
String temp = "";
for (int i = 0; i < n; i++)
	{
	temp = "";
	for (int z = 0; z < str.length(); z++)
		if (str.charAt(z) == 'A')
			temp += "B";
		else
			temp += "BA";
	str = temp;
	}

System.out.println(countA(str) + " " + countB(str));
}

else
System.out.println(nums[n - 2] + " " + nums[n - 1]);


scan.close();
	}

}
