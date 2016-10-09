import java.util.Scanner;
public class acm {
    
public static int num(String str) {
    return (int)(str.charAt(0) - 65);
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int[] nums = new int[26];
boolean[] solved = new boolean[26];
int time = 0;
int problems = 0;

while (true)
    {
    int min = scan.nextInt();
    
    if (min == -1)
        break;
    
    String prob = scan.next();
    String corr = scan.next();
    
    if (corr.equals("right"))
        {
        nums[num(prob)] += min;
        solved[num(prob)] = true;
        }
    
    if (corr.equals("wrong"))
        nums[num(prob)] += 20;
    }

for (int i = 0; i < nums.length; i++)
    if (solved[i])
        {
        time += nums[i];
        problems++;
        }

System.out.println(problems + " " + time);

scan.close();
    }
}