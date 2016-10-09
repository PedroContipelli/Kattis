import java.util.Scanner;
import java.util.ArrayList;
public class tsp {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
ArrayList<Integer> nums = new ArrayList<>();

int many = scan.nextInt();

for (int i = 0; i < many; i++)
	{
	scan.next(); scan.next();
	nums.add(i);
	}

for (int i = 0; i < many; i++)
	System.out.println(nums.remove((int)(Math.random() * nums.size())));

scan.close();
	}
}