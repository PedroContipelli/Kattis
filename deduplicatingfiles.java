import java.util.*;
import java.io.*;
public class deduplicatingfiles {
    
public static char hash(String str) {
    char hash = (char)0;
    
    for (int i = 0; i < str.length(); i++)
        hash ^= str.charAt(i);
    
    return hash;
}

public static int triangle(int n) {
    return (n)*(n + 1) / 2 - n;
}

public static void main(String[] args) throws IOException {
BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

while (true)
    {
    int files = Integer.parseInt(scan.readLine());
    
    if (files == 0)
        break;
    
    HashMap<String , Integer> uniques = new HashMap<>();
    
    while (files --> 0)
        {
        String file = scan.readLine();
        
        if (!uniques.containsKey(file))
            uniques.put(file , 1);
        else
            uniques.put(file , uniques.get(file) + 1);
        }
    
    int collisions = 0;
    
    for (String file1 : uniques.keySet())
        {
        char hash1 = hash(file1);
        
        for (String file2 : uniques.keySet())
            {
            if (!file1.equals(file2))
                {
                char hash2 = hash(file2);
                
                if (hash1 == hash2)
                    collisions += uniques.get(file1)*uniques.get(file2);
                }
            }
        }
    
    System.out.println(uniques.size() + " " + collisions / 2);
    }

scan.close();
    }
}