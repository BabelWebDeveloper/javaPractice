public class Main {
    public static void main(String[] args) {
        BaseBurger burger = new BaseBurger("medium-rare","bread","medium-rare",20.50);

        burger.additions("tomato");
        burger.additions("avocado");
        burger.additions("tomato");
        burger.additions("tomato");
        burger.additions("tomato");
        burger.additions();

        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("medium-rare");
        healthyBurger.additions("tomato");
        healthyBurger.additions("tomato");
        healthyBurger.additions("tomato");
        healthyBurger.additions("tomato");
        healthyBurger.additions("onion");
        healthyBurger.additions("cheddar");
        healthyBurger.additions("cheddar");
        healthyBurger.additions();

        System.out.println();

        BaseBurger burger2 = new BaseBurger("medium-rare","bread","medium-rare",20.50);
        burger2.additions("tomato");
        burger2.additions("avocado");
        burger2.additions("tomato");
        burger2.additions("tomato");
        burger2.additions("tomato");
        burger2.additions();

        System.out.println();

    }
}
