import java.util.Scanner;
import java.util.ArrayList;
public class blackfriday {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int zax = scan.nextInt();
int[] nums = new int[6];
ArrayList<Integer> indices = new ArrayList<>();

for (int i = 0; i < zax; i++)
	{
	int var = scan.nextInt();
	nums[var - 1]++;
	indices.add(var);
	}

for (int i = 5; i >= -1; i--)
	{
	if (i == -1)
		{
		System.out.println("none");
		break;
		}
	if (nums[i] == 1)
		{
		System.out.println(indices.indexOf(i + 1) + 1);
		break;
		}
	}

scan.close();
	}

}
