import java.util.*;
public class runningmom {

public static boolean search(String start , HashMap<String , HashSet<String>> map , HashSet<String> visited) {
    
    for (String city : map.get(start))
        {
        if (!visited.contains(city))
            {
            visited.add(city);
            
            if (search(city , map , visited))
                return true;
            }
        else
            return true;
        }
    
    return false;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
HashMap<String , HashSet<String>> cities = new HashMap<>();

int n = scan.nextInt();
String[] info = new String[2*n];

for (int i = 0; i < 2*n; i += 2)
    {
    info[i] = scan.next();
    info[i + 1] = scan.next();
    
    if (!cities.containsKey(info[i]))
        cities.put(info[i] , new HashSet<String>());
    
    if (!cities.containsKey(info[i + 1]))
        cities.put(info[i + 1] , new HashSet<String>());
    
    cities.get(info[i]).add(info[i + 1]);
    }

scan.nextLine();

while (scan.hasNextLine())
    {
    HashSet<String> tour = new HashSet<>();
    String city = scan.nextLine();
    tour.add(city);
    
    System.out.print(city + " ");
    System.out.println(search(city , cities , tour) ? "safe" : "trapped");
    }

scan.close();
    }
}