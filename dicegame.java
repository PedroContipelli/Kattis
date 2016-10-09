import java.util.Scanner;
public class dicegame {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int a1 = scan.nextInt();
int b1 = scan.nextInt();
int a2 = scan.nextInt();
int b2 = scan.nextInt();

int c1 = scan.nextInt();
int d1 = scan.nextInt();
int c2 = scan.nextInt();
int d2 = scan.nextInt();

int[] dice1 = new int[b1 - a1 + 1];
int[] dice2 = new int[b2 - a2 + 1];

int[] dice3 = new int[d1 - c1 + 1];
int[] dice4 = new int[d2 - c2 + 1];

for (int i = 0; i < dice1.length; i++)
	dice1[i] = a1 + i;
for (int i = 0; i < dice2.length; i++)
	dice2[i] = a2 + i;
for (int i = 0; i < dice3.length; i++)
	dice3[i] = c1 + i;
for (int i = 0; i < dice4.length; i++)
	dice4[i] = c2 + i;

int emma = 0;
int gunnar = 0;

for (int i = 0; i < dice1.length; i++)
	for (int j = 0; j < dice2.length; j++)
		for (int k = 0; k < dice3.length; k++)
			for (int l = 0; l < dice4.length; l++)
				{
				if (dice1[i] + dice2[j] > dice3[k] + dice4[l])
					gunnar++;
				if (dice1[i] + dice2[j] < dice3[k] + dice4[l])
					emma++;
				}

if (emma > gunnar)
	System.out.println("Emma");
else if (gunnar > emma)
	System.out.println("Gunnar");
else
	System.out.println("Tie");

scan.close();
	}

}
