import java.util.Scanner;
public class okvir {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int rows = scan.nextInt();
int columns = scan.nextInt();
String[] words = new String[rows];

int up = scan.nextInt();
int left = scan.nextInt();
int right = scan.nextInt();
int down = scan.nextInt();

for (int i = 0; i < rows; i++)
    words[i] = scan.next();

rows += up + down;
columns += left + right;

char[][] board = new char[rows][columns];

for (int i = 0; i < rows; i++)
    for (int j = 0; j < columns; j++)
        board[i][j] = ' ';

for (int r = up; r < rows - down; r++)
    for (int c = left; c < columns - right; c++)
        board[r][c] = words[r - up].charAt(c - left);

for (int i = 0; i < rows; i++)
    for (int j = 0; j < columns; j++)
        if (board[i][j] == ' ')
            {
            if (i % 2 == 0)
                board[i][j] = j % 2 == 0 ? '#' : '.';
            else
                board[i][j] = j % 2 == 0 ? '.' : '#';
            }

for (int i = 0; i < board.length; i++)
    System.out.println(new String(board[i]));

scan.close();
    }
}