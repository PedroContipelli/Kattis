import java.util.Scanner;
public class musicalnotation {
	
static String[] notes;
static int[] index;
static int current;
public static String music(String letter , boolean dash) {
	
	String str = letter + ": ";
	int pos = 0;
	char add = ' ';
			
	if (dash)
		add = '-';
	
	for (int i = 0; i < notes.length; i++)
		if (notes[i].substring(0 , 1).equals(letter))
			{
			while (pos < index[i])
				{
				str += add;
				pos++;
				}
			
			for (int j = 0; j < Integer.parseInt(notes[i].substring(1)); j++)
				{
				str += "*";
				pos++;
				}
			}
	
	while (pos < current - 1)
		{
		str += add;
		pos++;
		}
	
	return str;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int count = scan.nextInt();
notes = new String[count];
index = new int[count];
current = 0;

for (int i = 0; i < count; i++)
	{
	notes[i] = scan.next();
	index[i] = current;
	
	if (notes[i].length() == 1)
		notes[i] += "1";
	
	current += Integer.parseInt(notes[i].substring(1));
	
	current++;
	}

System.out.println(music("G" , false));
System.out.println(music("F" , true));
System.out.println(music("E" , false));
System.out.println(music("D" , true));
System.out.println(music("C" , false));
System.out.println(music("B" , true));
System.out.println(music("A" , false));
System.out.println(music("g" , true));
System.out.println(music("f" , false));
System.out.println(music("e" , true));
System.out.println(music("d" , false));
System.out.println(music("c" , false));
System.out.println(music("b" , false));
System.out.println(music("a" , true));

scan.close();
	}

}