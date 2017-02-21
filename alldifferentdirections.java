import java.util.*;
import java.io.*;
public class alldifferentdirections {
    
public static double[] eval(String directions) {
    
    StringTokenizer scan = new StringTokenizer(directions , " ");
    
    double x = Double.parseDouble(scan.nextToken());
    double y = Double.parseDouble(scan.nextToken());
    
    scan.nextToken();
    
    double angle = Double.parseDouble(scan.nextToken());
    
    while (scan.hasMoreTokens())
        {
        String cmd = scan.nextToken();
        
        if (cmd.equals("turn"))
            angle += Double.parseDouble(scan.nextToken());
        else
            {
            double walk = Double.parseDouble(scan.nextToken());
            x += walk * Math.cos(Math.toRadians(angle));
            y += walk * Math.sin(Math.toRadians(angle));
            }
        }
    
    double[] end = {x , y};
    return end;
}

public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

while (true)
    {
    int n = Integer.parseInt(br.readLine());
    
    if (n == 0)
        break;
    
    double[][] all = new double[n][2];
    
    for (int i = 0; i < n; i++)
        all[i] = eval(br.readLine());
    
    double avgX = 0;
    double avgY = 0;
    
    for (int i = 0; i < n; i++)
        {
        avgX += all[i][0];
        avgY += all[i][1];
        }
    
    avgX /= n;
    avgY /= n;
    
    double maxOff = 0;
    
    for (int i = 0; i < n; i++)
        maxOff = Math.max(maxOff , Math.hypot(avgX - all[i][0] , avgY - all[i][1]));
    
    System.out.println(avgX + " " + avgY + " " + maxOff);
    }

br.close();
    }
}