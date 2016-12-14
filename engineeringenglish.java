import java.util.Scanner;
import java.util.HashSet;
public class engineeringenglish {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

HashSet<String> vocab = new HashSet<>();

while (scan.hasNext())
  {
  String word = scan.next();
  
  if (!vocab.contains(word.toLowerCase()))
    {
    System.out.print(word + " ");
    vocab.add(word.toLowerCase());
    }
  else
    System.out.print(". ");
  }
  
scan.close();
  }
}