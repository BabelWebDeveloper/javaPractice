public class Main {
    public static void main(String[] args) {
        Car car = new Car(4,"BMW");
        System.out.println(car.startEngine());

        Ford ford = new Ford(8,"F150");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
    }
}
