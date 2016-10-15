import java.util.Scanner;
public class sevenwonders {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String cards = scan.next();

int length = cards.length();

int T = length - cards.replaceAll("T" , "").length();
int C = length - cards.replaceAll("C" , "").length();
int G = length - cards.replaceAll("G" , "").length();

int sum = T*T + C*C + G*G + (7 * Math.min(Math.min(T , C) , G));

System.out.println(sum);

scan.close();
	}
}