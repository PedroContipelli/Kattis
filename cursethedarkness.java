import java.util.Scanner;
public class cursethedarkness {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

while (cases --> 0)
    {
    double bookX = scan.nextDouble();
    double bookY = scan.nextDouble();
    
    int candles = scan.nextInt();
    double[] candleX = new double[candles];
    double[] candleY = new double[candles];
    
    for (int i = 0; i < candles; i++)
        {
        candleX[i] = scan.nextDouble();
        candleY[i] = scan.nextDouble();
        }
    
    boolean lit = false;
    
    for (int i = 0; i < candles; i++)
        if (Math.hypot(Math.abs(bookX - candleX[i]) , Math.abs(bookY - candleY[i])) <= 8)
            lit = true;
    
    System.out.println(lit ? "light a candle" : "curse the darkness");
    }

scan.close();
    }
}