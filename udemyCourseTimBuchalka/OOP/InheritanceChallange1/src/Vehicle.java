public class Vehicle {
//    standard variables for any vehicle:
    private String name;
    private String fuel;
    private int weight;

    public Vehicle(String name, String fuel, int weight) {
        this.name = name;
        this.fuel = fuel;
        this.weight = weight;
    }

    public void move(int speed, boolean isAccelerating) {
        if (isAccelerating) {
            System.out.println(getName() + " is moving at " + speed + " km/h" + " and accelerating");
        } else {
            System.out.println(getName() + " is moving at " + speed + " km/h");
        }
    }

    public String getName() {
        return name;
    }

    public String getFuel() {
        return fuel;
    }

    public int getWeight() {
        return weight;
    }
}
