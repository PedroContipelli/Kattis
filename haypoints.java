import java.util.HashMap;
public class haypoints {
public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int words = scan.getInt();
int descs = scan.getInt();

HashMap<String , Integer> map = new HashMap<>();

for (int i = 0; i < words; i++)
	map.put(scan.getWord(), scan.getInt());

for (int zax = 0; zax < descs; zax++)
	{
	int sum = 0;
	
	while (true)
		{
		String word = scan.getWord();
		
		if (word.equals("."))
			break;
		
		if (map.containsKey(word))
			sum += map.get(word);
		}
	
	System.out.println(sum);
	}

scan.close();
	}
}