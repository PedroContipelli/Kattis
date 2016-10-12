import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
public class opensource {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

big: while (true) {
ArrayList<Project> uni = new ArrayList<>();

while (true)
	{
	String line = scan.nextLine();
	
	if (line.equals("1"))
		break;
	
	if (line.toUpperCase().equals(line))
		uni.add(new Project(line));
	else
		uni.get(uni.size() - 1).addName(line);
	}

ArrayList<String> global = new ArrayList<>();
HashSet<String> blacklist = new HashSet<>();

for (int i = 0; i < uni.size(); i++)
	global.addAll(uni.get(i).names);

Collections.sort(global);

for (int i = 0; i < global.size() - 1; i++)
	if (global.get(i).equals(global.get(i + 1)))
		blacklist.add(global.get(i));

for (int i = 0; i < uni.size(); i++)
	uni.get(i).names.removeAll(blacklist);

Collections.sort(uni , new Comparator<Project>() {
	public int compare(Project a , Project b) {
		if (a.names.size() < b.names.size())
			return 1;
		if (a.names.size() > b.names.size())
			return -1;
		
		return a.title.compareTo(b.title);
	}
});

for (int i = 0; i < uni.size(); i++)
	System.out.println(uni.get(i));

if (scan.hasNextInt())
	break big;
}

scan.close();
}

static class Project {
	String title;
	HashSet<String> names;
	
public Project(String title) {
	this.title = title;
	names = new HashSet<String>();
	}

public void addName(String name) { names.add(name); }

public String toString() { return title + " " + names.size(); }
	}
}