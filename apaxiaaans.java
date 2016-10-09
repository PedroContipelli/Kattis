import java.util.Scanner;
public class apaxiaaans {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String str = scan.next();
String ret = "";

for (int i = 0; i < str.length(); i++)
    if ((i == str.length() - 1) || str.charAt(i) != str.charAt(i + 1))
        ret += str.charAt(i);

System.out.println(ret);

scan.close();
    }
}