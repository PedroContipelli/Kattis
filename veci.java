import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class veci {
	
public static int leftLess(ArrayList<Integer> list , int index) {
	int num = list.get(index);
	for (int i = index - 1; i >= 0; i--)
		if (list.get(i) < num)
			return i;
	
	return -1;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String num = scan.next();
ArrayList<Integer> nums = new ArrayList<>();

for (int i = 0; i < num.length(); i++)
    nums.add(Integer.parseInt(num.substring(i , i + 1)));

int leftless = -1;

for (int i = nums.size() - 1; i > 0; i--)
	{
	leftless = leftLess(nums , i);
	if (leftless != -1)
		{
		int temp = nums.get(leftless);
		nums.set(leftless, nums.get(i));
		nums.set(i, temp);
		break;
		}
	}

if (leftless == -1)
	System.out.println(0);
else
	{
    ArrayList<Integer> side = new ArrayList<>();
    leftless += 1;
    
    for (int i = leftless; i < nums.size(); i++)
        side.add(nums.get(i));
    
    Collections.sort(side);
    
    String str = "";
    
    for (int i = 0; i < leftless; i++)
        str += nums.get(i);
    
    for (int i = 0; i < side.size(); i++)
        str += side.get(i);
    
    System.out.println(str);
	}

scan.close();
    }
}