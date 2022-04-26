public class Dog {
    private static String name;//zmienna name zadeklarowana jako static

    public Dog(String name) {
        Dog.name = name;
    }

    public void printName() {
        System.out.println("name= " + name);
    }
}
