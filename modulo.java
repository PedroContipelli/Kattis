import java.util.Scanner;
import java.util.ArrayList;
public class modulo {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

ArrayList<Integer> nums = new ArrayList<>();
int test = 0;

for (int i = 0; i < 10; i++)
	{
	test = scan.nextInt() % 42;
	if (!nums.contains(test))
		nums.add(test);
	}

System.out.println(nums.size());

scan.close();
	}

}
