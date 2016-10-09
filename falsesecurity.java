import java.util.Scanner;
import java.util.HashMap;
public class falsesecurity {


public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

HashMap<String , String> toMorse = new HashMap<>();
HashMap<String , String> toLetters = new HashMap<>();

String[] Morse = {".-" , "-..." , "-.-." , "-.." , "." , "..-." , "--." , "...." , ".." , ".---" , "-.-" , ".-.." , "--" , "-." , "---" , ".--." , "--.-" , ".-." , "..." , "-" , "..-" , "...-" , ".--" , "-..-" , "-.--" , "--.." , "..--" , ".-.-" , "---." , "----"};
String[] Letters = {"A" , "B" , "C" , "D" , "E" , "F" , "G" , "H" , "I" , "J" , "K" , "L" , "M" , "N" , "O" , "P" , "Q" , "R" , "S" , "T" , "U" , "V" , "W" , "X" , "Y" , "Z" , "_" , "," , "." , "?"};

for (int i = 0; i < 30; i++)
	{
	toMorse.put(Letters[i], Morse[i]);
	toLetters.put(Morse[i], Letters[i]);
	}

while (scan.hasNextLine())
	{
	
	String encoded = scan.nextLine();
	String str = "";
	String lengths = "";
	
	for (int i = 0; i < encoded.length(); i++)
		{
		str += toMorse.get(encoded.substring(i , i+1));
		lengths = toMorse.get(encoded.substring(i , i+1)).length() + lengths;
		}
	
	String decoded = "";
	int x = 0;
	for (int i = 0; i < lengths.length(); i++)
		{
		int length = Integer.parseInt(lengths.substring(i, i + 1));
		decoded += toLetters.get(str.substring(x, x + length));
		x += length;
		}
	
	System.out.println(decoded);
	
	}


scan.close();
	}
}