public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        if (duration <= 0){
            this.duration = 0;
        } else {
            this.duration = duration;
        }
    }
}
