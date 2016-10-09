import java.util.Scanner;
public class alphabetspam {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String str = scan.next();
double length = str.length();
int whitespace = 0;
int lowercase  = 0;
int uppercase  = 0;
int symbols    = 0;

for (int i = 0; i < str.length(); i++)
    {
    char X = str.charAt(i);
    if (X == '_')
        whitespace++;
    else if (X >= 97 && X <= 122)
        lowercase++;
    else if (X >= 65 && X <= 90)
        uppercase++;
    else
        symbols++;
    }

System.out.println(whitespace / length);
System.out.println(lowercase  / length);
System.out.println(uppercase  / length);
System.out.println(symbols    / length);

scan.close();
    }
}