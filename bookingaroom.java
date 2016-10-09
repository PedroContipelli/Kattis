import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class bookingaroom {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int rooms = scan.nextInt();
int taken = scan.nextInt();
ArrayList<Integer> nums = new ArrayList<>();

for (int i = 0; i < taken; i++)
	nums.add(scan.nextInt());

if (rooms == taken)
	System.out.println("too late");
else
	{
	Collections.sort(nums);
	for (int i = 1; i <= rooms; i++)
		if (!nums.contains(i))
			{
			System.out.println(i);
			break;
			}
	}

scan.close();
	}
}
