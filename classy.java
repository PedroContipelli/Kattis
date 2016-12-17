import java.util.Arrays;
public class classy {
public static void main(String[] args) {
Kattio scan = new Kattio(System.in);

int cases = scan.getInt();

while (cases --> 0)
	{
	int names = scan.getInt();
	
	Person[] people = new Person[names];
	
	for (int i = 0; i < people.length; i++)
		{
		people[i] = new Person(scan.getWord() , scan.getWord());
		scan.getWord();
		}
	
	Arrays.sort(people);
	
	for (Person x : people)
		System.out.println(x);
	
	System.out.println("==============================");
	}

scan.close();
	}
}

class Person implements Comparable<Person> {
	
String name;
int rank;

public Person (String name , String rank) {

	this.name = name.substring(0 , name.length() - 1);
	this.rank = rank(rank);
}

private char word(String rank) {

	if (rank.equals("upper"))
		return '2';
	
	if (rank.equals("middle"))
		return '1';
	
	return '0';
}

private int rank(String str) {

	String[] uml = str.split("-");
	
	char[] base3 = new char[12];
	
	Arrays.fill(base3 , '1');
	
	for (int i = 12 - uml.length; i < base3.length; i++)
		base3[i] = word(uml[i - (12 - uml.length)]);
	
	String tritString = new String(new StringBuilder(new String(base3)).reverse());
	
	return Integer.parseInt(tritString , 3);
}

public int compareTo(Person p) {
	if (this.rank == p.rank)
		return this.name.compareTo(p.name);
	
	return p.rank - this.rank;
}

public String toString() {
	return this.name;
}

}