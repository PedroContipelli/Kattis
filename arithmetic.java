import java.util.*;
public class arithmetic {
	
public static String Base8toBase16(String base8 , boolean leadingZeroes) {

int base10 = Integer.parseInt(base8 , 8);
String base16 = Integer.toString(base10 , 16).toUpperCase();

// Formatting
base16 = "XXX" + base16;
base16 = base16.substring(base16.length() - 3);

return base16.replace("X" , leadingZeroes ? "0" : "");
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String base8 = scan.nextLine();

while (base8.length() % 4 != 0)
	base8 = "0" + base8;

String lead = base8.substring(0 , 4);
System.out.print(Base8toBase16(lead , false));

for (int i = 4; i < base8.length(); i += 4)
	System.out.print(Base8toBase16(base8.substring(i , i + 4) , true));

scan.close();
    }
}