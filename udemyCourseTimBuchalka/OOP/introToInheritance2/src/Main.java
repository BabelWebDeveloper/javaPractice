public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();//wywołanie walk w dog.java
        dog.run();
        System.out.println();
        dog.move(30);

        Fish fish = new Fish("Golden fish", 1,1,2,2,1);

//        fish.move(20);

    }
}
