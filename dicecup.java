import java.util.Scanner;
import java.util.HashMap;
public class dicecup {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int a = scan.nextInt();
int b = scan.nextInt();

HashMap<Integer , Integer> map = new HashMap<>();

for (int i = 1; i <= a; i++)
	for (int j = 1; j <= b; j++)
		map.put(i + j, map.containsKey(i + j) ? map.get(i + j) + 1 : 1);

int max = 0;

for (int sum : map.keySet())
	max = Math.max(max, map.get(sum));

for (int sum : map.keySet())
	if (map.get(sum) == max)
		System.out.println(sum);

scan.close();
	}
}