import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist {
    private LinkedList<Song> songs;
    private ArrayList<Album> albums;
    private String name;

    public Playlist(String name) {
        this.songs = new LinkedList<>();
        this.albums = new ArrayList<>();
        this.name = name;
    }

    private static boolean addSong(LinkedList<Song> songs, Song song){
//        here condition if song exist on some album... (two for loops), this.albums

    }
}
