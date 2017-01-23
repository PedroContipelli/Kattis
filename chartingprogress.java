import java.util.*;
public class chartingprogress {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (scan.hasNext())
    {
    ArrayList<String> graph = new ArrayList<>();
    
    while (scan.hasNext())
        {
        String row = scan.nextLine();

        if (row.isEmpty())
            break;
        
        graph.add(row);
        }
    
    int total = 0;
    
    for (String row : graph)
        {
    	char[] log = row.replace("*" , "..").toCharArray();
    	
    	int stars = log.length - row.length();
        
    	for (int i = 0; i < stars; i++)
    		log[row.length() - 1 - total++] = '*';
        
        System.out.println(new String(log).substring(0 , row.length()));
        }
    
    System.out.println();
    }

scan.close();
    }
}