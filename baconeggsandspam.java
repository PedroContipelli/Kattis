import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class baconeggsandspam {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
    {
    int num = scan.nextInt();
    HashMap<String , ArrayList<String>> map = new HashMap<>();
    ArrayList<String> ingredients = new ArrayList<>();
    
    if (num == 0)
        break;
    
    for (int zax = 0; zax < num; zax++)
        {
        String name = scan.next();
        String[] ing = scan.nextLine().substring(1).split(" ");
        
        for (int i = 0; i < ing.length; i++)
            {
            if (!map.containsKey(ing[i]))
                {
                ArrayList<String> in = new ArrayList<>();
                in.add(name);
                map.put(ing[i] , in);
                ingredients.add(ing[i]);
                }
            else
                {
                ArrayList<String> in = map.get(ing[i]);
                in.add(name);
                map.put(ing[i] , in);
                }
            }
        }
    
    Collections.sort(ingredients);
    
    for (int i = 0; i < ingredients.size(); i++)
        {
        System.out.print(ingredients.get(i));
        
        ArrayList<String> names = map.get(ingredients.get(i));
        Collections.sort(names);
        
        for (int z = 0; z < names.size(); z++)
            System.out.print(" " + names.get(z));
    
        System.out.println();
        }

    System.out.println();
    }

scan.close();
    }
}