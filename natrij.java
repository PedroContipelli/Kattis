import java.util.*;
public class natrij {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String[] nums1 = scan.next().split(":");
String[] nums2 = scan.next().split(":");

int[] time1 = new int[3];
int[] time2 = new int[3];

for (int i = 0; i < 3; i++)
    {
    time1[i] = Integer.parseInt(nums1[i]);
    time2[i] = Integer.parseInt(nums2[i]);
    }

for (int i = 2; i >= 1; i--)
    if (time2[i] < time1[i])
        {
        time2[i] += 60;
        time2[i - 1] -= 1;
        }

if (time2[0] < time1[0])
    time2[0] += 24;

String[] time = new String[3];

for (int i = 0; i < 3; i++)
    {
    String num = "00" + (time2[i] - time1[i]);
    time[i] = num.substring(num.length() - 2);
    }

String arr = Arrays.toString(time).replace("," , ":").replace(" " , "");

if (Arrays.equals(nums1 , nums2))
    System.out.println("24:00:00");
else
    System.out.println(arr.substring(1 , arr.length() - 1));

scan.close();
    }
}