public class Plane extends Vehicle {
    private int wings;
    private int engines;

    public Plane(String name, int drivers, String surface, int weight, boolean isRemote, String fuel, int wings, int engines) {
        super(name, drivers, "air", weight, isRemote, fuel);//wpisane wartości czyli surface air przyjmujemy jako standardowe dla samolotów - czyli przyjmujemy że każdy samolot musi mieć bezwzględnie poruszać się w powietrzu jeśli ma być nazywany samolotem
        this.wings = wings;
        this.engines = engines;
    }

    public void takingOff() {
        System.out.println("Take off");
        move("Boening 787", 100);
    }
    public void fly(){
        System.out.println("Fly");
        move("Boening 787",700);//wywołanie funkcji z pliku głównego move z parametrem 700 z tym że:
        // jeśli jest nadpisana w pliku obecnym wtedy odapala się tylko to co jest zawarte w tym nadpisaniu,
        // jeśli zaś nie jest nadpisana wtedy odapala się wszystko to co jest zawarte w plku głównym - Vehicle.java
    }

    @Override //nadpisujemy metodę klasy-parent w metodzie klasy-child (method overriding)
    public void move(String name, int speed) {
        System.out.println("Plane.move() called (overwritten)");
        //takingOff();zakomentowane - jeśli chcielibyśmy wpisać wszystkie "procedury" lotu do jednej funkcji, a potem wywołać ją w Main.java
        //fly();
        super.move(name,speed);//odpala również funkcję zawartą w pliku "głównym" - Vehicle.java
    }

}
