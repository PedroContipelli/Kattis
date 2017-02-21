import java.util.*;
public class increasingsubsequence {

public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

while (true)
    {
    int num = scan.getInt();
    
    if (num == 0)
        break;
    
    int[] nums = new int[num];
    
    for (int i = 0; i < nums.length; i++)
        nums[i] = scan.getInt();
    
    ArrayList<Integer> maxes = new ArrayList<>();
    ArrayList<ArrayList<Integer>> subs  = new ArrayList<>();

    for (int a : nums)
        {
        if (subs.isEmpty())
            {
            ArrayList<Integer> seq = new ArrayList<Integer>();
            seq.add(a);
            subs.add(seq);
            maxes.add(a);
            }
        else
            {
            int index = Collections.binarySearch(maxes , a);
            
            if (index >= 0)
                continue;
            
            index = -index - 2;
            
            if (index == -1)
                {
                ArrayList<Integer> seq = new ArrayList<>();
                seq.add(a);
                subs.set(0 , seq);
                maxes.set(0 , a);
                }
            else
                {
                ArrayList<Integer> seq = new ArrayList<>(subs.get(index));
                seq.add(a);
                
                if (index != maxes.size() - 1)
                    {
                    subs.set(index + 1 , seq);
                    maxes.set(index + 1, a);
                    }
                else
                    {
                    subs.add(seq);
                    maxes.add(a);
                    }
                }
            }
        }
    
    ArrayList<Integer> ans = subs.get(subs.size() - 1);
    System.out.println(ans.size() + " " + ans.toString().substring(1 , ans.toString().length() - 1).replace("," , ""));
    }

scan.close();
    }
}