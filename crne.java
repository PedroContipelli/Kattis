import java.util.Scanner;
public class crne {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

long n = scan.nextLong();

if (n % 2 == 0)
    {
    n = n / 2 + 1;
    System.out.println(n*n);
    }
else
    System.out.println((n + 1)*(n + 3) / 4);

/*
  if even:
     (n/2 + 1) ^ 2
     
   if odd:
     (n + 1)(n + 3)/4
*/

scan.close();
    }
}