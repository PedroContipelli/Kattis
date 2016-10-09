import java.util.Scanner;
public class secretmessage {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int testcases = scan.nextInt();
scan.nextLine();

for (int zaxbys = 0; zaxbys < testcases; zaxbys++)
	{
	String str = scan.nextLine();
	int i = 1;
	int length = str.length();
	
	while (i * i < str.length())
		i++;

	for (int x = 0; x < i*i - length; x++)
		str += "*";

	char[][] nums = new char[i][i];
	
	for (int r = 0; r < nums.length; r++)
		for (int c = 0; c < nums.length; c++)
			nums[r][c] = str.charAt(i*r + c);
	
	for (int c = 0; c < nums.length; c++)
		for (int r = nums.length - 1; r >= 0; r--)
			if (nums[r][c] != '*')
				System.out.print(nums[r][c]);

	System.out.println();
	}

scan.close();
	}

}
