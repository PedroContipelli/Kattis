public class supercomputer {
public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int bits = scan.getInt();
int queries = scan.getInt();

boolean[] mem = new boolean[bits + 1];
int[] count = new int[bits + 1];

while (queries --> 0)
	{
	String cmd = scan.getWord();
	
	if (cmd.equals("F"))
		{
		int i = scan.getInt();
		mem[i] = !mem[i];
		
		if (mem[i])
			for (int x = i; x < count.length; x++)
				count[x]++;
		else
			for (int x = i; x < count.length; x++)
				count[x]--;
		}
	else
		{
		int i = scan.getInt();
		int j = scan.getInt();
		
		System.out.println(count[j] - count[i - 1]);
		}
	}

scan.close();
	}
}