import java.util.*;
import java.io.*;
public class imagedecoding {
    
static String block = "####################################################################################################";
static String dots  = "....................................................................................................";

public static String gen(int length , boolean full) {
    return full ? block.substring(0 , length) : dots.substring(0 , length);
}

public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer scan;

boolean firstCase = true;

while (true)
    {
    int lines = Integer.parseInt(br.readLine());
    
    if (lines == 0)
        break;
    
    if (firstCase)
        firstCase = false;
    else
        System.out.println();
    
    boolean error = false;
    boolean full = true;
    int length = 0;
    
    for (int i = 0; i < lines; i++)
        {
        String print = "";
        scan = new StringTokenizer(br.readLine() , " ");
        
        full = scan.nextToken().charAt(0) == '#';
        
        while (scan.hasMoreTokens())
            {
            int num = Integer.parseInt(scan.nextToken());
            print += gen(num , full);
            full = !full;
            }
        
        if (i == 0)
            length = print.length();
        else if (print.length() != length)
            error = true;

        System.out.println(print);
        }
    
    if (error)
        System.out.println("Error decoding image");
    }

br.close();
    }
}