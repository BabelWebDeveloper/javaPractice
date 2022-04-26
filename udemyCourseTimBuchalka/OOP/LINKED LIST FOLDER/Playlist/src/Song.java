import java.util.LinkedList;

public class Song {
    private String name;
    private double durationTime;

    public Song(String name, double durationTime) {
        this.name = name;
        this.durationTime = durationTime;
    }

    public String getName() {
        return name;
    }

    public double getDurationTime() {
        return durationTime;
    }
}
