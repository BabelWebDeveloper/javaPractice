import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";;;;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0,this.name);
        values.add(1,this.weapon);
        values.add(2,"" + this.hitPoints);
        values.add(3,"" + this.strength);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues.size() > 0 && savedValues != null){
            this.name = savedValues.get(0);
            this.weapon = savedValues.get(1);
            this.hitPoints = Integer.parseInt(savedValues.get(2));
            this.strength = Integer.parseInt(savedValues.get(3));
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
