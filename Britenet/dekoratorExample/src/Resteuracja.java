import BasicClass.Pizza;
import Decorators.PizzaAnanas;
import Decorators.PizzaJalapeno;

public class Resteuracja {
    public static void main(String[] args) {
        Pizza margheritta = new Pizza();
        Pizza jalapeno = new PizzaJalapeno(margheritta); //dodajemy do pizzy podstawowej Jalapeno
        Pizza PizzaJalapenoAnanas = new PizzaAnanas(jalapeno); // do utworzonej wyżej pizzy podstawowej z jalapeno dodajemy jeszcze ananasa...fuj

        System.out.println(margheritta.getPrice());
        System.out.println(jalapeno.getPrice());
        System.out.println(PizzaJalapenoAnanas.getPrice());
    }
}
