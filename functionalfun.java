import java.util.Scanner;
import java.util.HashSet;
public class functionalfun {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (scan.hasNext())
  {
  boolean notAFunction = false;
  boolean injective = true;
  boolean surjective = true;
  
  scan.next();
  scan.nextLine();
  scan.next();
  
  String[] codomain = scan.nextLine().trim().split(" ");
  
  HashSet<String> setX = new HashSet<>();
  HashSet<String> setY = new HashSet<>();
  
  int values = scan.nextInt();
  
  while (values --> 0)
    {
    String x = scan.next();
    scan.next();
    String y = scan.next();
    
    if (setX.contains(x))
      notAFunction = true;
      
    if (setY.contains(y))
      injective = false;
      
    setX.add(x);
    setY.add(y);
    }
    
  for (int i = 0; i < codomain.length; i++)
    if (!setY.contains(codomain[i]))
      surjective = false;
      
  if (notAFunction)
    System.out.println("not a function");
  else if (injective && surjective)
    System.out.println("bijective");
  else if (injective)
    System.out.println("injective");
  else if (surjective)
    System.out.println("surjective");
  else
    System.out.println("neither injective nor surjective");
  }
  
scan.close();
  }
}