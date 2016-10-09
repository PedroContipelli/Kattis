import java.util.Arrays;
public class phonelist {
public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int cases = scan.getInt();

for (int zax = 0; zax < cases; zax++)
	{
	int many = scan.getInt();
	String[] nums = new String[many];
	
	for (int i = 0; i < many; i++)
		nums[i] = scan.getWord();
	
    Arrays.sort(nums);
    
    boolean consistent = true;
    
    for (int i = 1; i < nums.length; i++)
    	if (nums[i].startsWith(nums[i - 1]))
    		{
    		consistent = false;
    		break;
			}
    
    if (consistent)
    	System.out.println("YES");
    else
    	System.out.println("NO");
	}

scan.close();
	}
}