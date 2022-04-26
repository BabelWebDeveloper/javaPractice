import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Album album = new Album("The rolling stones");
        album.addSongs("Satisfaction",4.10);
        album.addSongs("Paint It Black",3.23);
        album.addSongs("Beast of Burden",4.05);
        Album album1 = new Album("Styl życia gnoja");
        album1.addSongs("Definicja pener",5.20);
        album1.addSongs("Szkoła życia",3.23);
        album1.addSongs("Bragga",4.05);
        Album album2 = new Album("Nothing but the Beat");
        album2.addSongs("Sweat",4.05);
        album2.addSongs("Turn me on",3.23);
        album2.addSongs("Where Them Girls At",5.20);
//        ___________________________________________________________________

        Playlist playlist = new Playlist("New Playlist");
        playlist.addAlbum(album);
        playlist.addAlbum(album1);
        playlist.addAlbum(album2);

//        ___________________________________________________________________

        addSongs(playlist,"Sweat");
        addSongs(playlist,"Beast of Burden");
        removeSongs(playlist,"Beast of Burden");
        addSongs(playlist,"Paint It Black");
        addSongs(playlist,"Szkoła życia");
        addSongs(playlist,"Braga");
        addSongs(playlist,"Bragga");
//        playlist.printPlaylist();
        System.out.println("_______________________________");

//        ogarnięte dodawanie i usuwanie piosenek z playlisty
        playPlaylist(playlist);

    }

    private static void addSongs(Playlist playlist, String songName){
        boolean result = playlist.addToPlaylist(songName);
        if (result){
            System.out.println(songName + " successfully added.");
        } else {
            System.out.println("Adding song error");
        }
    }

    private static void removeSongs(Playlist playlist, String songName){
        boolean result = playlist.removeFromPlaylist(songName);
        if (result){
            System.out.println(songName + " successfully removed.");
        } else {
            System.out.println("Removing song error");
        }
    }

    private static void playPlaylist(Playlist playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        LinkedList<Song> songs = playlist.getPlaylistSongs();
        ListIterator<Song> listIterator = songs.listIterator();
        String actualTrack = "";

        if (songs.isEmpty()){
            System.out.println("No songs");
            return;
        } else {
            actualTrack = listIterator.next().getName();
            System.out.println("Actual track : " + actualTrack);
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("MP-3 Player shutting down...");
                    quit = true;
                    break;

                case 1:
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()){
                        actualTrack = listIterator.next().getName();
                        System.out.println("Actual track : " + actualTrack);
                    } else {
                        System.out.println("Reached end of the playlist.");
                        goingForward = false;
                    }
                    printMenu();
                    break;

                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        actualTrack = listIterator.previous().getName();
                        System.out.println("Actual track : " + actualTrack);
                    } else {
                        System.out.println("We are at the start of the playlist.");
                        goingForward = true;
                    }
                    printMenu();
                    break;

                case 3:
                    System.out.println("Now playing: " + actualTrack);
                    printMenu();
                    break;

                case 4:
                    System.out.println("Type song name to add: ");
                    String songAdd = scanner.nextLine();
                    addSongs(playlist,songAdd);
                    playPlaylist(playlist);
                    quit = true;
                    break;

                case 5:
                    System.out.println("Type song name to remove: ");
                    String songRemove = scanner.nextLine();
                    removeSongs(playlist,songRemove);
                    playPlaylist(playlist);
                    quit = true;
                    break;

                case 6:
                    playlist.printPlaylist();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n" +
                "0 - to quit\n" +
                "1 - go to next song\n" +
                "2 - go to previous song\n" +
                "3 - play an actual song\n" +
                "4 - add new song NOT WORK\n" +
                "5 - delete song form playlist\n" +
                "6 - print playlist");
    }
}
