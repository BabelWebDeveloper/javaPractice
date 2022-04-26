public class Car extends Vehicle{
    private String body;//unikalne cechy dla samochodów
    private int wheels;
    private int doors;
    private int gears;
    private int actualGear;
    private double engineDisplacement;
    private boolean isManual;

    public Car(String name, String fuel, int weight, String body, int wheels, int doors, int gears, double engineDisplacement, boolean isManual) {
        super(name, fuel, weight);//cechy wszystkich pojazdów pobrane z Vehicle.java
        this.body = body;
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.engineDisplacement = engineDisplacement;
        this.isManual = isManual;

        this.actualGear = 0;//dodatkowa zmienna nie przekazna do parametrów - zmienna pomocnicza przy ustalaniu biegów
    }

    public void changeGear(int newGear) {
        actualGear = newGear;
        System.out.println("Car.changeGear() called and actual gear is " + actualGear);
    }

    public void changeVelocity(int speed, int angleOfRoad) {
        System.out.println("Car.changeVelocity() called");
        move(speed,getDirection());//wywołanie metody move z Vehicle.java
    }

    public String getBody() {
        return body;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public int getActualGear() {
        return actualGear;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    public boolean isManual() {
        return isManual;
    }
}
