import java.util.Scanner;
public class permcode {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
	{
	int x = scan.nextInt();
	
	if (x == 0)
		break;
	
	String S = scan.next();
	@SuppressWarnings("unused")
	String P = scan.next();
	
		/*
		char[] M = scan.next().toCharArray();
		char[] C = new char[M.length];
		
		int n = M.length;
		
		int d = (int)(Math.pow(n, 1.5) + x) % n;
		
		C[d] = S.charAt(P.indexOf(M[d]));
		
		for (int j = 0; j < n; j++)
			if (j != d)
			C[j] = S.charAt(P.indexOf(M[j]) ^ S.indexOf(M[(j + 1) % n]));
		
		*/
	
	char[] C = scan.next().toCharArray();
	char[] M = new char[C.length];
	int[] nums = new int[C.length];
	
	int n = C.length;
	
	int d = (int)(Math.pow(n, 1.5) + x) % n;
	
	for (int j = 0; j < n; j++)
		if (j != d)
			nums[j] = S.indexOf(C[j]);   //  = P.indexOf(M[j]) ^ S.indexOf(M[(j + 1) % n])
		
		// C[j] = S.charAt(P.indexOf(M[j]) ^ S.indexOf(M[(j + 1) % n]));
	
	
	
	System.out.println(C);
	System.out.println(M);
		
	
	}

scan.close();
	}

}
