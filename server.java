import java.util.Scanner;
public class server {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int total = scan.nextInt();
int time  = scan.nextInt();
int [] nums = new int[total];

for (int i = 0; i < total; i++)
    nums[i] = scan.nextInt();

int count = 0;

for (int i = 0; i < total; i++)
    {
    time -= nums[i];
    
    if (time >= 0)
        count++;
    }

System.out.println(count);
    
scan.close();
    }
}