public class Main {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle("Vehicle","gasoline",2);

        Car bmw = new Car("BMW","diesel",2,4,"sedan");
        bmw.move(200,true);
        bmw.maneuver("left");
        bmw.upShifting();
        bmw.decreaseSpeed();
    }
}
