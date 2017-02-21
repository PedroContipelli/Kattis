import java.util.*;
import java.io.*;
public class musicyourway {
    
static String attributes;
    
public static void sort(Song[] songs , int sortBy) {
    
    Arrays.sort(songs , new Comparator<Song>() {
        public int compare(Song song1 , Song song2) {
            return song1.names[sortBy].compareTo(song2.names[sortBy]);
        }
    });
}

public static void print(Song[] songs) {
    
    System.out.println(attributes);
    
    for (Song song : songs)
        System.out.println(song);
    
    System.out.println();
}

public static void main(String[] args) throws IOException {
BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

attributes = scan.readLine();
Song.attributes = attributes.split(" ");
HashMap<String , Integer> map = new HashMap<>();

for (int i = 0; i < Song.attributes.length; i++)
    map.put(Song.attributes[i] , i);

int n = Integer.parseInt(scan.readLine());
Song[] songs = new Song[n];

for (int i = 0; i < n; i++)
    songs[i] = new Song(scan.readLine());

n = Integer.parseInt(scan.readLine());

for (int i = 0; i < n; i++)
    {
    String att = scan.readLine();
    int sortBy = map.get(att);
    sort(songs , sortBy);
    print(songs);
    }
    
scan.close();
    }
}

class Song {
    
static String[] attributes;
String[] names;

public Song(String line) {
    names = line.split(" ");
}

public String toString() {
    String print = "";
    
    for (String att : names)
        print += att + " ";
    
    return print.substring(0 , print.length() - 1);
}

}