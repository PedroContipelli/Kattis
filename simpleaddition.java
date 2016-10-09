import java.util.Scanner;
import java.math.BigInteger;
public class simpleaddition {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

BigInteger BigS = new BigInteger(scan.next());
BigInteger BigT = new BigInteger(scan.next());

System.out.println(BigS.add(BigT));

scan.close();
    }
}