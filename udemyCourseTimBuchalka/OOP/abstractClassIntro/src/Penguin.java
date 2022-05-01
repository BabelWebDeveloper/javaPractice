public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

//    must override to change functionality of fly() (polymorphism) - because penguins doesn't fly
    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not very good at that, can I go swim instead?");
    }
}
