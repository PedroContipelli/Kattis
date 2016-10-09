import java.util.Scanner;
public class cetvrta {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int[] nums1 = new int[3];
int[] nums2 = new int[3];

for (int i = 0; i < 3; i++)
	{
	nums1[i] = scan.nextInt();
	nums2[i] = scan.nextInt();
	}

for (int i = 0; i < 3; i++)
	if (nums1[i] != nums1[(i + 1) % 3] && nums1[i] != nums1[(i + 2) % 3])
		System.out.print(nums1[i] + " ");

for (int i = 0; i < 3; i++)
	if (nums2[i] != nums2[(i + 1) % 3] && nums2[i] != nums2[(i + 2) % 3])
		System.out.println(nums2[i]);

scan.close();
	}

}