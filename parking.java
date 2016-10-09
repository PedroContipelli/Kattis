import java.util.Scanner;
public class parking {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
    
    int A = scan.nextInt();
    int B = scan.nextInt();
    int C = scan.nextInt();
    
    int[] trucks = new int[101];
    
    int Arrival1 = scan.nextInt();
    int Departure1 = scan.nextInt();
    
    int Arrival2 = scan.nextInt();
    int Departure2 = scan.nextInt();
    
    int Arrival3 = scan.nextInt();
    int Departure3 = scan.nextInt();
    
    for (int i = Arrival1; i < Departure1; i++)
        trucks[i]++;
    
    for (int i = Arrival2; i < Departure2; i++)
        trucks[i]++;
    
    for (int i = Arrival3; i < Departure3; i++)
        trucks[i]++;
    
    long cost = 0;
    
    for (int i = 0; i < trucks.length; i++)
        {
        if (trucks[i] == 1)
            cost += A;
        if (trucks[i] == 2)
            cost += 2*B;
        if (trucks[i] == 3)
            cost += 3*C;
        }
    
    System.out.println(cost);
    
scan.close();
    }
}