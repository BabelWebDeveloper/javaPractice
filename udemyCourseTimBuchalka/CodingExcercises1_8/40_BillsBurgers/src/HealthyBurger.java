public class HealthyBurger extends Hamburger{//inheritance
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    //    constructor:
    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    //    methods:
    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    //    polymorphism (zmiana w returnie):
    @Override
    public double itemizeHamburger() {
        double healthyPrice = 0;
        if (healthyExtra1Name != null){
            healthyPrice += healthyExtra1Price;
        }
        if (healthyExtra2Name != null){
            healthyPrice += healthyExtra2Price;
        }
        return super.itemizeHamburger() + healthyPrice;
    }
}
