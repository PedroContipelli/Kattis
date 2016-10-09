import java.util.Scanner;
public class chopin {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = 1;

while (scan.hasNext())
	{
	String[] notes = {"A#" , "Bb" , "C#" , "Db" , "D#" , "Eb" , "F#" , "Gb" , "G#" , "Ab"};
	
	String str = scan.next();
	String tonality = scan.next();
	
	System.out.print("Case " + cases + ": ");
	
	if (str.length() == 1)
		System.out.println("UNIQUE");
	else
		{
		for (int i = 0; i < notes.length; i++)
			if (str.equals(notes[i]))
				{
				if (i % 2 == 0)
					System.out.print(notes[i + 1] + " ");
				else
					System.out.print(notes[i - 1] + " ");
				}
		
		System.out.println(tonality);
		}
	
	cases++;
	}

scan.close();
	}
}