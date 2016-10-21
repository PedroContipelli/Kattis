import java.util.Arrays;
public class cd {
public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

while (true)
	{
	int n = scan.getInt();
	int m = scan.getInt();
	
	if (n == 0 && m == 0)
		break;
	
	int[] cds = new int[n];
	
	int count = 0;
	
	for (int i = 0; i < n; i++)
		cds[i] = scan.getInt();
	
	for (int i = 0; i < m; i++)
		if (Arrays.binarySearch(cds, scan.getInt()) >= 0)
			count++;
	
	System.out.println(count);
	}

scan.close();
	}
}