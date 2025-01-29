import java.util.*;
import java.util.LinkedList;
public class dsalinkedlist{
    public static void main(String[] args) {
        LinkedList<String> songs = new LinkedList<>();
        LinkedList<String> artists = new LinkedList<>();
        LinkedList<String> playlist = new LinkedList<>();

        songs.add("Daylight");
        songs.add("Pantropiko");
        songs.add("Isa Lang");
        songs.add("Ikaw Lang");
        songs.add("Pano");

        artists.add("Taylor Swift");
        artists.add("Bini");
        artists.add("Arthur Nery");
        artists.add("Nobita");
        artists.add("Zack Tabudlo");

        
        for (int i = 0; i < songs.size(); i++) {
            playlist.add(songs.get(i) + " - " + artists.get(i));
        }

        //for each loop for songs
        System.out.println("\nSongs: " + songs.size());
        System.out.println(songs);
        for (String song : songs) {
            System.out.println(song);
        }

        //for each loop for artists
        System.out.println("\nArtists: " + artists.size());
        System.out.println(artists);
        for (String artist : artists) {
            System.out.println(artist);
        }

        //for each loop for playlist
        System.out.println("\nPlaylist:");
        for (String item : playlist) {
            System.out.println(item);
        }
    }
}