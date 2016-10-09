public class howmanydigits {
public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

while (scan.hasMoreTokens())
	{
	int x = scan.getInt();
	System.out.println((int)(Math.log10(Math.sqrt(2 * x * Math.PI)) + x*Math.log10(x / Math.E)) + 1);
	}

scan.close();
	}
}