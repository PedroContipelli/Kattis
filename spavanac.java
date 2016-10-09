import java.util.Scanner;
public class spavanac {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int hours = scan.nextInt();
int minutes = scan.nextInt();

minutes -= 45;

if (minutes < 0)
    {
    hours -= 1;
    minutes += 60;
    }
if (hours < 0)
    hours = 23;

System.out.println(hours + " " + minutes);

scan.close();
    }
}