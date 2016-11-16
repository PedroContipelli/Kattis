import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class walrusweights {

static int[] nums;
static ArrayList<Integer> close = new ArrayList<>();

public static void gen(int index , int sum , boolean use , int nearest) {
    
close.add(nearest);

if (index == nums.length)
    return;

if (use)
    sum += nums[index];

if (close1000(sum , nearest , false))
    nearest = sum;
else if (sum != 0)
    return;

gen(index + 1 , sum , true , nearest);
gen(index + 1 , sum , false , nearest);
}

public static boolean close1000(int a , int b , boolean equ) {
    return equ ? Math.abs(1000 - a) <= Math.abs(1000 - b) : Math.abs(1000 - a) < Math.abs(1000 - b); 
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int amt = scan.nextInt() + 1;
nums = new int[amt];

for (int i = 1; i < amt; i++)
    nums[i] = scan.nextInt();

Arrays.sort(nums);
gen(0 , 0 , false , 10000000);
Collections.sort(close);

int near = 0;

while (close.get(0) == 0)
    close.remove(0);

for (int x : close)
    if (close1000(x , near , true))
        near = x;

System.out.println(near);
scan.close();
    }
}