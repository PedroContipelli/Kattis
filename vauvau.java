import java.util.Scanner;
public class vauvau {
static int A;
static int B;
static int C;
static int D;

public static void dogs(int in) {
    int sum = 0;
    if (in % (A + B) != 0 && in % (A + B) <= A)
        sum++;
    if (in % (C + D) != 0 && in % (C + D) <= C)
        sum++;
    
    if (sum == 0)
        System.out.println("none");
    if (sum == 1)
        System.out.println("one");
    if (sum == 2)
        System.out.println("both");
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

A = scan.nextInt();
B = scan.nextInt();
C = scan.nextInt();
D = scan.nextInt();

int first  = scan.nextInt();
int second = scan.nextInt();
int third  = scan.nextInt();

dogs(first);
dogs(second);
dogs(third);

scan.close();
    }
}