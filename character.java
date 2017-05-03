import java.util.*;
public class character {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int n = scan.nextInt();
System.out.println((int)(Math.pow(2 , n) - n - 1));

scan.close();
    }
}