import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class hidingplaces {

public static int index(int x) {
	return 8 - x;
}

public static int index(char x) {
	return x - 'a';
}

public static String chess(int a , int b) {
	return "" + (char)(b + 'a') + (8 - a);
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int cases = scan.nextInt();

while (cases --> 0)
	{
	int[][] board = new int[8][8];
	
	for (int i = 0; i < 8; i++)
		for (int j = 0; j < 8; j++)
			board[i][j] = -1;
	
	String knight = scan.next();
	board[index(Integer.parseInt(knight.substring(1)))][index(knight.charAt(0))] = 0;
	
	ArrayList<String> queue = new ArrayList<>();
	queue.add(knight);
	
	while (!queue.isEmpty())
		{
		String current = queue.remove(0);
		
		int r = index(Integer.parseInt(current.substring(1)));
		int c = index(current.charAt(0));
		
		int[] rAdd = {-2 , -2 , -1 , -1 , 1 , 1 , 2 , 2};
		int[] cAdd = {-1 , 1 , -2 , 2 , -2 , 2 , -1 , 1};
		
		for (int i = 0; i < 8; i++)
			if (r + rAdd[i] >= 0 && r + rAdd[i] < 8 && c + cAdd[i] >= 0 && c + cAdd[i] < 8 && board[r + rAdd[i]][c + cAdd[i]] == -1)
				{
				board[r + rAdd[i]][c + cAdd[i]] = board[r][c] + 1;
				queue.add(chess(r + rAdd[i] , c + cAdd[i]));
				}
		}
	
	int max = -1;
	
	for (int i = 0; i < 8; i++)
		for (int j = 0; j < 8; j++)
			max = Math.max(max , board[i][j]);
	
	ArrayList<String> places = new ArrayList<>();
	
	for (int i = 0; i < 8; i++)
		for (int j = 0; j < 8; j++)
			if (board[i][j] == max)
				places.add(chess(i , j));
	
	Collections.sort(places , new Comparator<String>() {
		public int compare(String str1 , String str2) {
			if (index(Integer.parseInt(str1.substring(1))) == index(Integer.parseInt(str2.substring(1))))
				return index(str1.charAt(0)) - index(str2.charAt(0));
			
			return index(Integer.parseInt(str1.substring(1))) - index(Integer.parseInt(str2.substring(1)));
		}
	});
	
	System.out.print(max + " ");
	System.out.println(places.toString().substring(1 , places.toString().length() - 1).replace("," , ""));
	}

scan.close();
	}
}