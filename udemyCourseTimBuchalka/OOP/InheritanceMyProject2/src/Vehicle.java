public class Vehicle {
    private String name;
    private String fuel;
    private int weight;

    private int velocity;
    private int direction;

    public Vehicle(String name, String fuel, int weight) {//prędkości nie pobieramy - ustawiamy wartośc początkową na 0, resztę pobieramy z parametrów;
        this.name = name;
        this.fuel = fuel;
        this.weight = weight;

        this.velocity = 0;
        this.direction = 0;
    }

    public void move(int speed, int direction) {
        System.out.println("Vehicle.move() called");
        velocity = speed;
        System.out.println(getName() + " is moving at " + velocity + " km/h in direction " + direction + " true course (angle of road).");
        System.out.println();
    }

    public void steer(int angleOfRoad) {
        this.direction += angleOfRoad;
    }

    public void stop(int speed) {
        System.out.println(getName() + " is not moving right now.");
        speed = 0;
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

    public int getVelocity() {
        return velocity;
    }

    public int getDirection() {
        return direction;
    }
}
