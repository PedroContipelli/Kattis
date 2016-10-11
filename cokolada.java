import java.util.Scanner;
public class cokolada {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int n = scan.nextInt();

if (Integer.bitCount(n) == 1)
    System.out.println(n + " 0");
else
    {
    int pow2 = 1;
    
    while (pow2 < n)
        pow2 *= 2;
    
    String bin = Integer.toBinaryString(n);
    System.out.println(pow2 + " " + (bin.lastIndexOf("1") + 1));
    }

scan.close();
    }
}