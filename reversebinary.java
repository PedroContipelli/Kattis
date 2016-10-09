import java.util.Scanner;
public class reversebinary {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int a = scan.nextInt();
String str = Integer.toBinaryString(a);
String bck = "";

for (int i = str.length() - 1; i >= 0; i--)
    bck += str.charAt(i);

System.out.println(Integer.parseInt(bck , 2));

scan.close();
    }
}