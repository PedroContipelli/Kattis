import java.util.*;
public class managingpackaging {
    
public static boolean canInstall(HashSet<String> deps , ArrayList<String> installs) {

    for (String dep : deps)
        if (!installs.contains(dep))
            return false;
    
    return true;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
    {
    int n = scan.nextInt();
    scan.nextLine();
    
    if (n == 0)
        break;
    
    ArrayList<String> packages = new ArrayList<>();
    ArrayList<String> installs = new ArrayList<>();
    HashMap<String , HashSet<String>> deps = new HashMap<>();
    
    for (int i = 0; i < n; i++)
        {
    	StringTokenizer token = new StringTokenizer(scan.nextLine() , " ");
    	
        String pack = token.nextToken();
        packages.add(pack);
        deps.put(pack , new HashSet<String>());
        
        while(token.hasMoreTokens())
            deps.get(pack).add(token.nextToken());
        }
    
    Collections.sort(packages);
    
    for (int i = 0; i < packages.size(); i++)
        {
        String pack = packages.get(i);
        
        if (canInstall(deps.get(pack) , installs))
            {
        	packages.remove(i);
            installs.add(pack);
            i = -1;
            }
        }
    
    if (installs.size() < n)
        System.out.println("cannot be ordered");
    else
        for (String pack : installs)
            System.out.println(pack);
    
    System.out.println();
    }

scan.close();
    }
}