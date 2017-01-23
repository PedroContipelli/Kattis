import java.util.Scanner;
import java.util.HashMap;
public class 4thought {

public static String op(int in) {
	if (in == 0)
		return " * ";
	if (in == 1)
		return " + ";
	if (in == 2)
		return " - ";
	
	return " / ";
}

public static String build(int a, int b, int c) {
	return "4" + op(a) + "4" + op(b) + "4" + op(c) + "4";
}

public static int arith(String oper) {
	int num1 = Integer.parseInt(oper.substring(0 , oper.indexOf(" ")));
	int num2 = Integer.parseInt(oper.substring(oper.lastIndexOf(" ") + 1));
	
	if (oper.contains(" * "))
		return num1 * num2;
	if (oper.contains(" + "))
		return num1 + num2;
	if (oper.contains(" - "))
		return num1 - num2;
	
	return num1 / num2;
}

public static int eval(String input) {
	
	while (input.contains(" * ") || input.contains(" / "))
		{
			int mult = input.indexOf("*");
			int divi = input.indexOf("/");
			int sub1 = mult - 2;
			int sub2 = mult + 2;
			
			if ((divi < mult && divi != -1) || mult == -1)
				{
				sub1 = divi - 2;
				sub2 = divi + 2;
				}
				
				while (sub1 != 0 && !input.substring(sub1 , sub1 + 1).equals(" "))
					sub1--;
				
				if (sub1 != 0)
					sub1++;
				
				while (sub2 != input.length() && !input.substring(sub2 , sub2 + 1).equals(" "))
					sub2++;
				
				input = input.substring(0 , sub1) + arith(input.substring(sub1 , sub2)) + input.substring(sub2);
		}
	
	while (input.contains(" + ") || input.contains(" - "))
		{
			int add = input.indexOf(" + ");
			int sub = input.indexOf(" - ");
			int sub1 = add - 1;
			int sub2 = add + 3;
			
			if ((sub < add && sub != -1) || add == -1)
				{
				sub1 = sub - 1;
				sub2 = sub + 3;
				}
				
				while (sub1 != 0 && !input.substring(sub1 , sub1 + 1).equals(" "))
					sub1--;
				
				if (sub1 != 0)
					sub1++;
				
				while (sub2 != input.length() && !input.substring(sub2 , sub2 + 1).equals(" "))
					sub2++;
				
				input = input.substring(0 , sub1) + arith(input.substring(sub1 , sub2)) + input.substring(sub2);
		}
		
	return Integer.parseInt(input);
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
HashMap<Integer , String> map = new HashMap<>();
String expression = "";
int cases = scan.nextInt();

for (int i = 0; i < 4; i++)
	for (int j = 0; j < 4; j++)
		for (int k = 0; k < 4; k++)
			{
			expression = build(i , j , k);
			map.put(eval(expression) , expression);
			}

for (int i = 0; i < cases; i++)
	{
	int num = scan.nextInt();
	if (map.containsKey(num))
		System.out.println(map.get(num) + " = " + num);
	else
		System.out.println("no solution");
	}

scan.close();
	}
}
