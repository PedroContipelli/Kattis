import java.util.Arrays;
import java.util.Scanner;
public class busyschedule {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

while (true)
    {
    int times = scan.nextInt();
    
    if (times == 0)
        break;
    
    Time[] T = new Time[times];
    
    for (int i = 0; i < T.length; i++)
        T[i] = new Time(scan.next() , scan.next());
    
    Arrays.sort(T);
    
    for (Time time : T)
        System.out.println(time);
    
    System.out.println();
    }

scan.close();
    }
}

class Time implements Comparable<Time> {
    int hours , mins;
    
    public Time(String time , String format) {
        hours = Integer.parseInt(time.substring(0 , time.indexOf(":"))) == 12 ? 0 : Integer.parseInt(time.substring(0 , time.indexOf(":")));
        mins = Integer.parseInt(time.substring(time.indexOf(":") + 1));
        
        if (format.equals("p.m."))
            hours += 12;
    }
    
    public int compareTo(Time time) {
        if (this.hours == time.hours)
            return this.mins - time.mins;
        
        return this.hours - time.hours;
    }
    
    public String toString() {
        
        String mins = ("000" + this.mins).substring(("000" + this.mins).length() - 2);
        
        if (hours >= 12)
            return (hours == 12 ? 12 : hours - 12) + ":" + mins + " p.m.";
        
        return (hours == 0 ? 12 : hours) + ":" + mins + " a.m.";
    }
}