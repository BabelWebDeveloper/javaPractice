import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.gears = new ArrayList<>();
        this.maxGears = maxGears;
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);

//        Constructor for adding gears by default:
//        for (int i = 0; i < maxGears; i++){
//            addGear(i, i * 5.3);
//        }
    }

    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio){
        if (number >= 0 && number <= this.maxGears){
            this.gears.add(new Gear(number,ratio));
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs){
        if (this.clutchIsIn){
            System.out.println("Scream!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    public void changeGear(int newGear){
        if (newGear >= 0 && newGear <= this.gears.size() && this.clutchIsIn){
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " is selected.");
        }
    }

    private class Gear {//here is an Inner Class
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio){
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }
    }
}
