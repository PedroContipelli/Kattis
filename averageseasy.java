import java.util.ArrayList;
import java.util.Scanner;
public class averageseasy {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

for (int zax = 0; zax < cases; zax++)
	{
	int CS = scan.nextInt();
	int EC = scan.nextInt();
	
	ArrayList<Integer> cs = new ArrayList<>();
	ArrayList<Integer> ec = new ArrayList<>();
	
	for (int i = 0; i < CS; i++)
		cs.add(scan.nextInt());
	
	for (int i = 0; i < EC; i++)
		ec.add(scan.nextInt());
	
	int totalCS = 0;
	int totalEC = 0;
	
	for (int i = 0; i < CS; i++)
		totalCS += cs.get(i);
	
	for (int i = 0; i < EC; i++)
		totalEC += ec.get(i);
	
	double avgCS = (double)totalCS / CS;
	double avgEC = (double)totalEC / EC;
	
	int count = 0;
	
	for (int i = 0; i < CS; i++)
		if (cs.get(i) < avgCS && cs.get(i) > avgEC)
			count++;
	
	System.out.println(count);
	}
scan.close();
	}
}