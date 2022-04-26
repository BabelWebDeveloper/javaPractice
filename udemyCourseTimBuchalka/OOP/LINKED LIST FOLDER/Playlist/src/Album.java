import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }
//    1. metoda ktróa sprawdza po nazwie czy song istnieje (w tym konkretnym albumie) i jeśli tak zwraca obiekt song - to w klasie Album
//    2. metoda ktróa jedzie po wszystkich albumach i w tym w którym jest song (metoda nr 1) o podanej nazwia zwraca song - to w klasie Playlist
//    3. metoda dodająca nowe songi do albumów wykorzystuje metodę nr 1, tworzy obiekt song z wpisanych name i duration time - to w klasie Album

    public Song checkSong(String songName){//public - will be used in playlist
        if (this.songs != null){
            for (int i = 0; i < this.songs.size(); i++){
                Song song = this.songs.get(i);
                if (song.getName().equals(songName)){
                    return song;
                }
            }
            return null;
        }
        return null;
    }

    public boolean addSongs(String songName, double durationTime){
        Song song = checkSong(songName);
        if (song == null){
            Song newSong = new Song(songName,durationTime);
            this.songs.add(newSong);
            return true;
        } else {
            System.out.println("That song already exist.");
            return false;
        }
    }

    public void printSongs(){
        for (int i = 0; i < this.songs.size(); i++){
            System.out.println(this.songs.get(i).getName());
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}
