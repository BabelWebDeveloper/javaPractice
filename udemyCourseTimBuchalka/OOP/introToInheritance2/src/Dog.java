public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);//wywołanie metody super pomije nadpisaną metodę w tym samym pliku i wywołuje tylko metodę znjadującą się w klasie "ogólnej" czyli animal.java
//        move(5);//wywołanie move w animal.java + jeśli funkcja move jest nadpisana w pliku Dog.java, wtedy dodatkowo wywołuje się również ona - wraz ze wszystkimi metodami które się w niej znajdują
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);

    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);//super - add more items
    }
}
