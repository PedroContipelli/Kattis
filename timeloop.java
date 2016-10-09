import java.util.Scanner;
public class timeloop {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    
    for (int i = 1; i <= n; i++)
        System.out.println(i + " Abracadabra");
        
    scan.close();
	}
}