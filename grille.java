import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class grille {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int n = scan.nextInt();
boolean[][] check = new boolean[n][n];
ArrayList<coord> nums = new ArrayList<>(n);
char[][] grille = new char[n][n];
boolean invalid = false;
int count = 0;

for (int r = 0; r < n; r++)
	{
	String str = scan.next();
	
	for (int c = 0; c < n; c++)
		if (str.charAt(c) == '.')
			{
			count++;
			nums.add(new coord(r , c));
			}
	}

String str = scan.next();

if ((count != str.length() / 4) && str.length() != 1)
	invalid = true;
else
{
int length = str.length() / 4;

for (int z = 0; z < 4; z++)
	{
	String sub = str.substring(z*length , z*length + length);
		if (str.length() == 1)
			sub = str;
	
	for (int i = 0; i < nums.size(); i++)
		grille[nums.get(i).x][nums.get(i).y] = sub.charAt(i);
	
	for (int i = 0; i < nums.size(); i++)
		{
		int x = nums.get(i).x;
		int y = nums.get(i).y;
		
		check[x][y] = true;
		nums.set(i, new coord(y , n - x - 1));
		}
	
	Collections.sort(nums , new Comparator<coord>() {
		public int compare(coord a , coord b) {
			if (a.x < b.x)
				return -1;
			
			if (a.x > b.x)
				return 1;
			
			if (a.x == b.x)
				{
				if (a.y < b.y)
					return -1;
				
				if (a.y > b.y)
					return 1;
				}
			
			return 0;
		}
	});
	
	}

for (int r = 0; r < n; r++)
	for (int c = 0; c < n; c++)
		if (!check[r][c])
			invalid = true;
}

if (invalid)
	System.out.println("invalid grille");
else
	{
	String line = "";
	
	for (int r = 0; r < n; r++)
		{
		String row = "";
		
		for (int c = 0; c < n; c++)
			row += grille[r][c];
		
		line += row;
		}
	
	System.out.println(line);
	}

scan.close();
	}

public static class coord {
	public int x;
	public int y;
	
	public coord(int x , int y)
		{
		this.x = x;
		this.y = y;
		}
	}
}