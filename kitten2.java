import java.util.*;
public class kitten2 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int[] graph = new int[101];

int kitten = scan.nextInt();
scan.nextLine();

while (true)
	{
	String line = scan.nextLine();
	
	if (line.equals("-1"))
		break;
	
	StringTokenizer token = new StringTokenizer(line , " ");
	
	int root = Integer.parseInt(token.nextToken());
	
	while (token.hasMoreTokens())
		{
		int branch = Integer.parseInt(token.nextToken());
		graph[branch] = root;
		}
	}

while (kitten != 0)
	{
	System.out.print(kitten + " ");
	kitten = graph[kitten];
	}

scan.close();
	}
}