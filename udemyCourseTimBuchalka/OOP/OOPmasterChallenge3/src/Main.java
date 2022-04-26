public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger("Standard","bread","medium-rare",20.50);
        burger.addIngredients("jalapeno","cheddar","onion","avocado");
        burger.bill();

        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("medium-rare");
        healthyBurger.addIngredients("jalapeno","cheddar","jalapeno","cheddar","jalapeno","onion");
        healthyBurger.bill();

        System.out.println();

        DeluxeBurger deluxeBurger = new DeluxeBurger("well-done","lays","whisky");
        deluxeBurger.addIngredients("jalapeno");
        deluxeBurger.bill();
    }
}
