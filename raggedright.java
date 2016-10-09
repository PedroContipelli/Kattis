import java.util.Scanner;
import java.util.ArrayList;
public class raggedright {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

ArrayList<Integer> nums = new ArrayList<>();

while (scan.hasNextLine())
    nums.add(scan.nextLine().length());

int max = 0;
int penalty = 0;

for (int i = 0; i < nums.size(); i++)
    max = Math.max(max , nums.get(i));

for (int i = 0; i < nums.size() - 1; i++)
    penalty += (max - nums.get(i)) * (max - nums.get(i));

System.out.println(penalty);

scan.close();
    }
}