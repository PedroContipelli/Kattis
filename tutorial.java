import java.math.BigInteger;
import java.util.Scanner;
public class tutorial {
    
public static int factorial(int n) {
    int fac = 1;
    
    for (int i = 2; i <= n; i++)
        fac *= i;
    
    return fac;
}

public static boolean one(int n , int m) {
    if (n >= 13)
        return false;
    
    return (factorial(n) <= m);
}

public static boolean two(int n , int m) {
    if (n >= 30)
        return false;
    
    return (Math.pow(2 , n) <= m);
}

public static boolean pow(int n , int m , int t) {
    BigInteger num = BigInteger.valueOf(n);
    int pow = t - 3;
    
    if (pow != 2)
        pow = pow == 0 ? 4 : 3;
    
    return num.pow(pow).compareTo(BigInteger.valueOf(m)) <= 0;
}

public static boolean six(int n , int m) {
    return n*(Math.log(n)/Math.log(2)) <= m;
}

public static boolean seven(int n , int m) {
    return n <= m;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
    
int m = scan.nextInt();
int n = scan.nextInt();
int t = scan.nextInt();

boolean AC = false;

if (t == 1)
    AC = one(n , m);
else if (t == 2)
    AC = two(n , m);
else if (t >= 3 && t <= 5)
    AC = pow(n , m , t);
else if (t == 6)
    AC = six(n , m);
else
    AC = seven(n , m);

System.out.println(AC ? "AC" : "TLE");
scan.close();
    }
}