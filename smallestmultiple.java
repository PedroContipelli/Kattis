import java.util.*;
import java.math.*;
public class smallestmultiple {

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (scan.hasNextLine())
    {
    StringTokenizer token = new StringTokenizer(scan.nextLine() , " ");
    
    ArrayList<Integer> nums = new ArrayList<>();
    
    while (token.hasMoreTokens())
        nums.add(Integer.parseInt(token.nextToken()));
    
    BigInteger lcm = BigInteger.ONE;
    
    for (int x : nums)
        lcm = lcm.multiply(BigInteger.valueOf(x)).divide(lcm.gcd(BigInteger.valueOf(x)));
    
    System.out.println(lcm);
    }

scan.close();
    }
}