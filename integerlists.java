public class integerlists {
	
public static String parse(String str) {
	return str.replaceAll("RR", "");
}

public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int cases = scan.getInt();

main: for (int zax = 0; zax < cases; zax++)
    {
    
    String moves = parse(scan.getWord());
    int amount = scan.getInt();
    int Dcount = 0;
    
    for (int i = 0; i < moves.length(); i++)
        if (moves.charAt(i) == 'D')
            Dcount++;
    
    if (Dcount >= amount)
        {
        scan.getWord();
        
        if (Dcount > amount)
            System.out.println("error");
        else
            System.out.println("[]");
        
        continue main;
        }
    else
        {
        String[] list = scan.getWord().split(",");
        String[] subs = moves.split("R");
        int len = list.length;
        
        list[0] = list[0].substring(1);
        list[len - 1] = list[len - 1].substring(0, list[len - 1].length() - 1);
        
        int indexi = 0;
        int indexf = list.length - 1;
        
        for (int i = 0; i < subs.length; i++)
            {
            if (i % 2 == 0)
                indexi += subs[i].length();
            else
                indexf -= subs[i].length();
            }
        
        String build = "[";
        
        if (subs.length % 2 == 1)
            {
            for (int i = indexi; i <= indexf; i++)
                build += list[i] + ",";
            }
        else
            {
            for (int i = indexf; i >= indexi; i--)
                build += list[i] + ",";
            }
        
        build = build.substring(0 , build.length() - 1) + "]";
        System.out.println(build);    
        }
    }


scan.close();
    }
}