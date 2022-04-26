class Car {
    private String name;
    private boolean engine = true;
    private int cylinders;
    private int wheels = 4;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
    }

    public String startEngine(){
        return "Engine started.";
    }

    public String accelerate(int speed){
        return "Unknown car accelerated by " + speed;
    }

    public String brake(int speed){
        return "Unknown car slowed down by " + speed;
    }


    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

class Audi extends Car {
    public Audi() {
        super("S6", 10);
    }

    @Override
    public String startEngine() {
        return getCylinders() + " cylinders engine is working now.";
    }

    @Override
    public String accelerate(int speed) {
        return getName() + " accelerated by " + speed;
    }

    @Override
    public String brake(int speed) {
        return super.brake(speed);
    }
}

class BMW extends Car {
    public BMW() {
        super("320d", 4);
    }

    @Override
    public String startEngine() {
        return getCylinders() + " cylinders engine is working now.";
    }

    @Override
    public String accelerate(int speed) {
        return getName() + " accelerated by " + speed;
    }

    @Override
    public String brake(int speed) {
        return getName() + " slowed down by " + speed;
    }
}

public class Main {
    public static void main(String[] args) {
        Audi audi = new Audi();
        BMW bmw = new BMW();

        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate(30));
        System.out.println(audi.brake(10));

        System.out.println();

        System.out.println(bmw.startEngine());
        System.out.println(bmw.brake(23));
        System.out.println(bmw.getWheels());
    }
}
