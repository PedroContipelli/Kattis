import java.util.Scanner;
public class timebomb {

public static char getNumber(char[][] nums , int marker) {
        String A = "";
        String B = "";
        String C = "";
        String D = "";
        String E = "";
        
        for (int x = marker; x < marker + 3; x++)
            {
            A += nums[x][0];
            B += nums[x][1];
            C += nums[x][2];
            D += nums[x][3];
            E += nums[x][4];
            }
        
        // Zero 0
        if (A.equals("***") &&
            B.equals("* *") &&
            C.equals("* *") &&
            D.equals("* *") &&
            E.equals("***")
            )
        return '0';
        
        // One 1
        if (A.equals("  *") &&
            B.equals("  *") &&
            C.equals("  *") &&
            D.equals("  *") &&
            E.equals("  *")
            )
        return '1';
                
        // Two 2
        if (A.equals("***") &&
            B.equals("  *") &&
            C.equals("***") &&
            D.equals("*  ") &&
            E.equals("***")
            )
        return '2';
                
        // Three 3
        if (A.equals("***") &&
            B.equals("  *") &&
            C.equals("***") &&
            D.equals("  *") &&
            E.equals("***")
            )
        return '3';
        
        // Four 4
        if (A.equals("* *") &&
            B.equals("* *") &&
            C.equals("***") &&
            D.equals("  *") &&
            E.equals("  *")
            )
        return '4';
        
        // Five 5
        if (A.equals("***") &&
            B.equals("*  ") &&
            C.equals("***") &&
            D.equals("  *") &&
            E.equals("***")
            )
        return '5';
        
        // Six 6
        if (A.equals("***") &&
            B.equals("*  ") &&
            C.equals("***") &&
            D.equals("* *") &&
            E.equals("***")
            )
        return '6';
        
        // Seven 7
        if (A.equals("***") &&
            B.equals("  *") &&
            C.equals("  *") &&
            D.equals("  *") &&
            E.equals("  *")
            )
        return '7';
        
        // Eight 8
        if (A.equals("***") &&
            B.equals("* *") &&
            C.equals("***") &&
            D.equals("* *") &&
            E.equals("***")
            )
        return '8';
        
        // Nine 9
        if (A.equals("***") &&
            B.equals("* *") &&
            C.equals("***") &&
            D.equals("  *") &&
            E.equals("***")
            )
        return '9';
        
        return 'X';
    }
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String A = scan.nextLine();
    String result = "";
    int Answer = 0;
        char[][] nums = new char[A.length()][5];
        
        for (int y = 0; y < nums[0].length; y++)
            {
            
            if (y != 0)
            A = scan.nextLine();
            
            for (int x = 0; x < nums.length; x++)
                nums[x][y] = A.charAt(x);
        
            }
        
        for (int x = 0; x < nums.length; x += 4)
            result += getNumber(nums , x);
        
    if (result.contains("X"))
        System.out.println("BOOM!!");
    else
    {
        Answer = Integer.parseInt(result);
    
    if (Answer % 6 == 0)
        System.out.println("BEER!!");
    else
        System.out.println("BOOM!!");
    }
    
    scan.close();
    }
}