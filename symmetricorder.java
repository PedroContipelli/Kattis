import java.util.Scanner;
public class symmetricorder {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int i = 0;

while (true)
    {
    i++;
    int length = scan.nextInt();
    
    if (length == 0)
        break;
    
    String[] names = new String[length];
    
    for (int j = 0; j < length; j++)
        {
        String str = scan.next();
        if (j % 2 == 0)
        names[j / 2] = str;
        else
        names[length - 1 - (j / 2)] = str;
        }
    
    System.out.println("SET " + i);
    
    for (int j = 0; j < length; j++)
        System.out.println(names[j]);
    }

scan.close();
    }
}