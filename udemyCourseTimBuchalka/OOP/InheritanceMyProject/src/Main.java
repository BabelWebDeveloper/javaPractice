public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Vehicle",1,"land",2,false,"gasoline");

        Plane plane = new Plane("Boening 787",2, vehicle.getSurface(), 140,false,"AvGas",2,4);

        plane.takingOff();
        plane.fly();
        //plane.move(560);//wywołanie dwóch funkcji niezbędnych do lotu

    }
}
