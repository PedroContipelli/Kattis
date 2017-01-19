import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class prva {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int R = scan.nextInt();
int C = scan.nextInt();
char[][] board = new char[R][C];

for (int i = 0; i < R; i++)
	board[i] = scan.next().toCharArray();

ArrayList<String> words = new ArrayList<>();

for (int i = 0; i < R; i++)
	{
	String[] line = new String(board[i]).split("#");
	
	for (int x = 0; x < line.length; x++)
		if (line[x].length() >= 2)
			words.add(line[x]);
	}

char[][] board2 = new char[C][R];

for (int i = 0; i < R; i++)
	for (int j = 0; j < C; j++)
		board2[j][i] = board[i][j];

for (int i = 0; i < C; i++)
	{
	String[] line = new String(board2[i]).split("#");
	
	for (int x = 0; x < line.length; x++)
		if (line[x].length() >= 2)
			words.add(line[x]);
	}

Collections.sort(words);
System.out.println(words.get(0));

scan.close();
	}
}