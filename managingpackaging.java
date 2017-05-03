import java.util.*;
public class managingpackaging {
    
public static HashSet<String> dependencies(String line) {
    StringTokenizer parse = new StringTokenizer(line , " ");
    HashSet<String> dependencies = new HashSet<>();
    
    while (parse.hasMoreTokens())
        dependencies.add(parse.nextToken());
    
    return dependencies;
}

public static boolean canInstall(String pack , HashMap<String , HashSet<String>> dependencies , ArrayList<String> installs) {
    HashSet<String> dep = dependencies.get(pack);
    
    if (dep.isEmpty())
        return true;
    
    for (String x : dep)
        if (!installs.contains(x))
            return false;
    
    return true;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

main:
while (true)
    {
    int n = scan.nextInt();
    
    if (n == 0)
        break;
    
    HashMap<String , HashSet<String>> dependencies = new HashMap<>();
    ArrayList<String> packages = new ArrayList<>();
    ArrayList<String> installs = new ArrayList<>();
    
    for (int i = 0; i < n; i++)
        {
        packages.add(scan.next());
        dependencies.put(packages.get(i) , dependencies(scan.nextLine()));
        }
    
    Collections.sort(packages);
    
    while (!packages.isEmpty())
        {
        boolean found = false;
        
        for (int i = 0; i < packages.size(); i++)
            {
            if (canInstall(packages.get(i) , dependencies , installs))
                {
                installs.add(packages.get(i));
                packages.remove(i);
                found = true;
                i = -1;
                }
            }
        
        if (!found)
            {
            System.out.println("cannot be ordered\n");
            continue main;
            }
        }
    
    for (String x : installs)
        System.out.println(x);
    
    System.out.println();
    }

scan.close();
    }
}