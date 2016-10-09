import java.util.ArrayList;
public class cargame {
public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int M = scan.getInt();
int N = scan.getInt();
ArrayList<String> dictionary = new ArrayList<>(M);

for (int i = 0; i < M; i++)
	dictionary.add(scan.getWord());

for (int i = 0; i < N; i++)
	{
	String str = scan.getWord().toLowerCase();
	char a = str.charAt(0);
	char b = str.charAt(1);
	char c = str.charAt(2);
	boolean valid = false;
	
	for (int x = 0; x < dictionary.size(); x++)
		{
		String check = dictionary.get(x);
		
		int occ1 = check.indexOf(a);
		int occ2 = check.indexOf(b , occ1 + 1);
		int occ3 = check.indexOf(c , occ2 + 1);
		
		if (occ1 == -1 || occ2 == -1 || occ3 == -1)
			continue;
		
		System.out.println(check);
		valid = true;
		break;
		}
	
	if (!valid)
		System.out.println("No valid word");
	}

scan.close();
	}
}