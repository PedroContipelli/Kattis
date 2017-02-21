import java.io.*;
public class primalrepresentation {
public static void main(String[] args) throws IOException {
Kattio scan = new Kattio(System.in);
PrintWriter write = new PrintWriter(System.out);

while (scan.hasMoreTokens())
    {
    int n = scan.getInt();
    
    if (n < 0)
        {
        n = -n;
        write.print("-1 ");
        }
    
    int sqrt = (int)Math.sqrt(n) + 1;
    
    for (int div = 2; div <= sqrt; div++)
        {
        int count = 0;
            
        while (n % div == 0)
            {
            n /= div;
            count++;
            }
        
        if (count >= 1)
            write.print((count > 1 ? div + "^" + count : div) + " ");
        }
    
    write.println(n != 1 ? n : "");
    write.flush();
    }

scan.close();
write.close();
    }
}