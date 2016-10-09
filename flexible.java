import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class flexible {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int length = scan.nextInt();
int nums = scan.nextInt();
int[] partitions = new int[nums + 2];

ArrayList<Integer> widths = new ArrayList<>();

partitions[0] = 0;
partitions[partitions.length - 1] = length;

for (int i = 0; i < nums; i++)
	partitions[i + 1] = scan.nextInt();

for (int i = 0; i < partitions.length; i++)
	for (int j = i + 1; j < partitions.length; j++)
		if (! widths.contains(partitions[j] - partitions[i]))
			widths.add(partitions[j] - partitions[i]);

Collections.sort(widths);

for (int i = 0; i < widths.size(); i++)
	{
	if (i == widths.size() - 1)
		System.out.println(widths.get(i));
	else
		System.out.print(widths.get(i) + " ");
	}

scan.close();
}
}
