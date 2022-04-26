public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {

        super(name, 1, 1, size, weight);//super "pobiera" cechy z plku głównego animal.java
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    private void moveMuscles() {

    }

    private void moveBackFin() {

    }

    private void swim(int speed) {
        moveMuscles();//składowa 1 na poruszanie się
        moveBackFin();//składowa 2 na poruszanie się
        super.move(speed);//wywołanie rezultatu ruchu - metody w pliku głównym


    }
}
