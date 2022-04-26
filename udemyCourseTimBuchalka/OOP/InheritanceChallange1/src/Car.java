import java.util.Objects;

public class Car extends Vehicle{
//    specific variables for car:
    private int wheels;
    private String body;

    public Car(String name, String fuel, int weight, int wheels, String body) {
        super(name, fuel, weight);
        this.wheels = wheels;
        this.body = body;
    }

    public void increaseSpeed() {
        System.out.println("Car is accelerating!");
    }

    public void decreaseSpeed() {
        System.out.println("Car is handling!");
    }

    public void upShifting() {
        System.out.println("Higher gear!");
    }

    public void downShift() {
        System.out.println("Lower gear!");
    }

    public void maneuver(String direction) {
        if (Objects.equals(direction, "left")) {
            System.out.println(getName() + " is turning left.");
        } else if (Objects.equals(direction, "right")) {
            System.out.println(getName() + " is turning right.");
        } else {
            System.out.println("Not turning");
        }
    }

    @Override
    public void move(int speed, boolean isAccelerating) {
        if (isAccelerating) {
            downShift();
            increaseSpeed();
        } else {
            upShifting();
            decreaseSpeed();
        }
        super.move(speed,isAccelerating);
    }
}

