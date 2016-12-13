import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class airconditioned {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int minions = scan.nextInt();

ArrayList<Range> ranges = new ArrayList<>();

while (minions --> 0)
    ranges.add(new Range(scan.nextInt(), scan.nextInt()));

Collections.sort(ranges);

int room = ranges.get(0).y;
int count = 1;

for (Range r : ranges)
    {
    if (r.x <= room)
        {
        if (r.y < room)
            room = r.y;
        }
    else
        {
        room = r.y;
        count++;
        }
    }

System.out.println(count);

scan.close();
    }
}

class Range implements Comparable<Range> {
    
int x , y;

public Range(int a , int b) {
    x = a;
    y = b;
}

public int compareTo(Range r) {
    if (this.x == r.x)
        return this.y - r.y;
    
    return this.x - r.x;
}

}