public class Vehicle {
    private String name;//tutaj definiujemy te cechy które ma KAŻDY pojazd
    private int drivers;
    private String surface;
    private int weight;
    private boolean isRemote;
    private String fuel;

    public Vehicle(String name, int drivers, String surface, int weight, boolean isRemote, String fuel) {
        this.drivers = drivers;
        this.surface = surface;
        this.weight = weight;
        this.isRemote = isRemote;
        this.fuel = fuel;
    }

    public void move(String name, int speed) {
        System.out.println(name + " is moving at " + speed);
    }

    public int getDrivers() {
        return drivers;
    }

    public String getSurface() {
        return surface;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isRemote() {
        return isRemote;
    }

    public String getFuel() {
        return fuel;
    }
}
