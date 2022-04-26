import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int strengh;
    private int hitPoints;

    public Monster(String name, int strengh, int hitPoints) {
        this.name = name;
        this.strengh = strengh;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public int getStrengh() {
        return strengh;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0,this.name);
        values.add(1,"" + this.strengh);
        values.add(2,"" + this.hitPoints);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0){
            this.name = savedValues.get(0);
            this.strengh = Integer.parseInt(savedValues.get(1));
            this.hitPoints = Integer.parseInt(savedValues.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", strengh=" + strengh +
                ", hitPoints=" + hitPoints +
                '}';
    }
}
