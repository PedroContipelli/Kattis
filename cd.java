import java.util.Scanner;
import java.util.ArrayList;
public class cd {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
ArrayList<Integer> nums = new ArrayList<Integer>();

int n = scan.nextInt();
int m = scan.nextInt();
int count = 0;

for (int i = 0; i < n; i++)
	nums.add(scan.nextInt());

for (int i = 0; i < m; i++)
	if (nums.contains(scan.nextInt()))
		count++;

scan.nextInt();
scan.nextInt();

System.out.println(count);
scan.close();
	}
}