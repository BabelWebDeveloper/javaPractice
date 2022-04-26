public class DeluxeBurger extends Hamburger{//inheritance

//    constructor:
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips",2.75);//super umożliwia wykonanie DOWOLNEJ funkcji z superclass (przydatne jeśli ją nadpiszemy i zmienimy lub zastosujemy polimirfizm)
        super.addHamburgerAddition2("Drink",1.81);
    }

//    polymorphism: (tutaj do "zablokowania" metod rodzica)
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}
