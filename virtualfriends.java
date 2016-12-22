import java.util.HashMap;
import java.util.HashSet;
public class virtualfriends {

public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int cases = scan.getInt();

while (cases --> 0)
    {
    HashMap<String , HashSet<String>> web = new HashMap<>();
    HashMap<String , String> find = new HashMap<>();
    int friendships = scan.getInt();
    
    while (friendships --> 0)
        {
        String friend1 = scan.getWord();
        String friend2 = scan.getWord();
        
        if (!find.containsKey(friend1) && !find.containsKey(friend2))
            {
            web.put(friend1 , new HashSet<>());
            web.get(friend1).add(friend1);
            web.get(friend1).add(friend2);
            
            find.put(friend2 , friend1);
            find.put(friend1 , friend1);
            }
        else if (!find.containsKey(friend1))
            {
            find.put(friend1 , find.get(friend2));
            web.get(find.get(friend1)).add(friend1);
            }
        else if (!find.containsKey(friend2))
            {
            find.put(friend2 , find.get(friend1));
            web.get(find.get(friend2)).add(friend2);
            }
        else if (!find.get(friend1).equals(find.get(friend2)))
            {   
        	if (web.get(find.get(friend1)).size() < web.get(find.get(friend2)).size())
        		{
        		String temp = friend2;
        		friend2 = friend1;
        		friend1 = temp;
        		}
        	
            web.get(find.get(friend1)).addAll(web.get(find.get(friend2)));
            
            for (String friend : web.get(find.get(friend2)))
                if (!friend.equals(friend2))
                    find.put(friend , find.get(friend1));
            
            web.remove(find.get(friend2));
            find.put(friend2 , find.get(friend1));
            }
        
        System.out.println(web.get(find.get(friend1)).size());
        }
    }

scan.close();
    }
}