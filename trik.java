import java.util.Scanner;
public class trik {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        
int ball = 0;
String moves = scan.next();

for (int i = 0; i < moves.length(); i++)
	{
    if (moves.charAt(i) == 'A' && ball != 2)
        ball = 1 - ball;

    if (moves.charAt(i) == 'B' && ball != 0)
        ball = -ball + 3;
    
    if (moves.charAt(i) == 'C' && ball != 1)
        ball = -ball + 2;
	}

System.out.println(ball + 1);

scan.close();
    }
}