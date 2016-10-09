import java.util.Scanner;
public class backspace {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String line = scan.nextLine();
char[] str = line.toCharArray();

int count = 0;

for (int i = str.length - 1; i >= 0; i--)
	if (str[i] == '<')
		{
		str[i] = ' ';
		count++;
		}
	else
		if (count > 0)
			{
			str[i] = ' ';
			count--;
			}

line = new String(str);
System.out.print(line.replaceAll(" ", ""));

scan.close();
	}
}