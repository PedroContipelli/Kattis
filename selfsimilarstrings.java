import java.util.Scanner;
public class selfsimilarstrings {

public static boolean similar(String str , int d) {

    for (int i = 0; i <= str.length() - d; i++)
        if (str.indexOf(str.substring(i , i + d)) == str.lastIndexOf(str.substring(i ,  i + d)))
            return false;
    
    return true;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (scan.hasNextLine())
    {
    String str = scan.nextLine();
    int i;
    
    for (i = str.length() - 1; i > 0; i--)
        if (similar(str , i))
            break;
    
    System.out.println(i);
    }

scan.close();
    }
}