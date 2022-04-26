public class Main {
    public static void main(String[] args) {
//        Static methods call:
        Calculator.printSum(5,10);
        printHello();

//        Instance methods call:
        Dog rex = new Dog();
        rex.bark();
    }

    public static void printHello() {
        System.out.println("Hello");
    }
}
