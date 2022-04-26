import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist{
    private String name;
    private ArrayList<Album> albums;
    private LinkedList<Song> playlistSongs;

    public Playlist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
        this.playlistSongs = new LinkedList<>();
    }

    private Album checkAlbum(Album album){
        for (int i = 0; i < this.albums.size(); i++){
            Album checkAlbum = this.albums.get(i);
            if (checkAlbum == album){
                return album;
            }
        }
        return null;
    }

    public boolean addAlbum(Album album){
        Album checkAlbum = checkAlbum(album);
        if (checkAlbum == null){
            this.albums.add(album);
            return true;
        } else {
            System.out.println("That album already exist.");
            return false;
        }
    }

    public void printAlbums(){
        for (int i = 0; i < this.albums.size(); i++){
            System.out.println((i+1) + ". " + this.albums.get(i).getName());
        }
    }
//    dotąd dobrze

    private Song checkSong(String songName){
        for (int i = 0; i < this.albums.size(); i++){
            Album album = checkAlbum(this.albums.get(i));
            if (album != null){
                Song song = album.checkSong(songName);
                if (song != null){
                    return song;
                }
            }
        }
        return null;
    }

    public void printPlaylist(){
        for (int i = 0; i < this.playlistSongs.size(); i++){
            System.out.println((i+1) + ". " + this.playlistSongs.get(i).getName());
        }
    }

    private Song checkPlaylist(Song song){
        for (int i = 0; i < this.playlistSongs.size(); i++){
            if (song.equals(this.playlistSongs.get(i))){
                return song;
            }
        }
        return null;
    }

    public boolean addToPlaylist(String songName){
        Song song = checkSong(songName);
        if (song != null){
            if ((checkPlaylist(song) == null)){
                this.playlistSongs.add(song);
                return true;
            } else {
                System.out.println("Song is already in the playlist.");
                return false;
            }
        } else {
            System.out.println("You don't own that song.");
            return false;
        }
    }

    public boolean removeFromPlaylist(String songName){
        Song song = checkSong(songName);
        if (song != null){
            if ((checkPlaylist(song) != null)){
                this.playlistSongs.remove(song);
                return true;
            } else {
                System.out.println("That song doesn't exist in the playlist..");
                return false;
            }
        } else {
            System.out.println("You don't own that song.");
            return false;
        }
    }

    public LinkedList<Song> getPlaylistSongs() {
        return playlistSongs;
    }
}
