import java.util.Scanner;
public class mancala {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

for (int zax = 0; zax < cases; zax++)
    {
    int num = scan.nextInt();
    int zeroIndex = 0;
    int[] nums = new int[2000];
    
    int gen = scan.nextInt();
    
    for (int z = 0; z < gen; z++)
        {
        zeroIndex = 0;
        
        while (nums[zeroIndex] != 0)
            zeroIndex++;
        
        nums[zeroIndex] = zeroIndex + 1;
        
        for (int i = 0; i < zeroIndex; i++)
            nums[i]--;
        }
    
    // Print Everything
    zeroIndex = 1999;
    
    while (nums[zeroIndex] == 0)
        zeroIndex--;
    
    System.out.println(num + " " + (zeroIndex + 1));
    
    for (int i = 0; i <= zeroIndex; i++)
        {
        System.out.print(nums[i] + " ");
        
        if (i % 10 == 9)
            System.out.println();
        }
    
    if (zeroIndex % 10 != 9)
        System.out.println();
    }

scan.close();
    }
}