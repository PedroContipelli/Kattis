import java.util.Scanner;
public class ptice {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int questions = scan.nextInt();
String str = scan.next();
String[] nums1 = new String[questions];
String[] nums2 = new String[questions];
String[] nums3 = new String[questions];
int adrian = 0;
int bruno = 0;
int goran = 0;
int temp = 0;

for (int i = 0; i < questions; i++)
    {
    temp = i % 3;
    if (temp == 0)
    nums1[i] = "A";
    if (temp == 1)
    nums1[i] = "B";
    if (temp == 2)
    nums1[i] = "C";
    }

for (int i = 0; i < questions; i++)
    {
    temp = i % 4;
    if (temp == 1)
    nums2[i] = "A";
    if (temp == 0 || temp == 2)
    nums2[i] = "B";
    if (temp == 3)
    nums2[i] = "C";
    }

for (int i = 0; i < questions; i++)
    {
    temp = i % 6;
    if (temp == 0 || temp == 1)
    nums3[i] = "C";
    if (temp == 2 || temp == 3)
    nums3[i] = "A";
    if (temp == 4 || temp == 5)
    nums3[i] = "B";
    }

for (int i = 0; i < questions; i++)
    {
    if (nums1[i].equals(str.substring(i , i + 1)))
        adrian++;
    if (nums2[i].equals(str.substring(i , i + 1)))
        bruno++;
    if (nums3[i].equals(str.substring(i , i + 1)))
        goran++;
    }

int max = Math.max(Math.max(adrian , bruno), Math.max(bruno , goran));
System.out.println(max);
if (max == adrian)
    System.out.println("Adrian");
if (max == bruno)
    System.out.println("Bruno");
if (max == goran)
    System.out.println("Goran");

scan.close();

    }
}