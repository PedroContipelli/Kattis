import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;
public class synchronizinglists {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
	{
	int a = scan.nextInt();
	if (a == 0)
		break;
	int[] nums1 = new int[a];
	int[] nums2 = new int[a];
	int[] nums3 = new int[a];
	int[] nums4 = new int[a];
	
	for (int i = 0; i < a; i++)
		{
		nums1[i] = scan.nextInt();
		nums3[i] = nums1[i];
		}
	
	for (int i = 0; i < a; i++)
	{
	nums2[i] = scan.nextInt();
	nums4[i] = nums2[i];
	}
	
	Arrays.sort(nums1);
	Arrays.sort(nums2);
	HashMap<Integer , Integer> map = new HashMap<>();
	
	for (int i = 0; i < a; i++)
	map.put(nums1[i], nums2[i]);
	
	for (int i = 0; i < a; i++)
		System.out.println(map.get(nums3[i]));
	
	System.out.println();
	}


scan.close();
	}

}
