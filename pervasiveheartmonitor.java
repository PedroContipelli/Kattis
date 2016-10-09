import java.util.ArrayList;
import java.util.Scanner;
public class pervasiveheartmonitor {
	
public static boolean isNumber(String str) {
	char x = str.charAt(0);
	int num = (int)x;
	return (num > 47) && (num < 58);
}

public static double mean(ArrayList<Double> nums) {
	double mean = 0;
	for (int i = 0; i < nums.size(); i++)
		mean += nums.get(i);
	return mean / nums.size();
}
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while(scan.hasNextLine())
	{
	String name = "";
	String[] input = scan.nextLine().split(" ");
	ArrayList<Double> nums = new ArrayList<>();
	
	for (int i = 0; i < input.length; i++)
		if (isNumber(input[i]))
			nums.add(Double.parseDouble(input[i]));
		else
			name += input[i] + " ";
	
	System.out.println(mean(nums) + " " + name);
	}

scan.close();
	}

}
