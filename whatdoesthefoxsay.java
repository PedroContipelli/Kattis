import java.util.Scanner;
import java.util.ArrayList;
public class whatdoesthefoxsay {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int testcases = scan.nextInt();
scan.nextLine();

for (int zax = 0; zax < testcases; zax++)
	{
	String[] sounds = scan.nextLine().split(" ");
	ArrayList<String> notfox = new ArrayList<>();
	
	while (true)
		{
		String str = scan.nextLine();
		if (str.equals("what does the fox say?"))
			break;
		
		notfox.add(str.split(" ")[2]);
		}
	
	for (int i = 0; i < sounds.length; i++)
		if (! notfox.contains(sounds[i]))
			System.out.print(sounds[i] + " ");
	}

scan.close();
}
}
