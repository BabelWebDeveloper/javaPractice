public class BurgerFactory {
    public Burger createBurger() {//metoda createBurger zwraca nową instancję - nowego burgera
        return new Burger();
    }

    class HealthyBurgerFactory extends BurgerFactory {//dziedziczenie zachowania od BurgerFactory
        @Override//nadpisanie metody createBurger (oraz klasy HealthyBurger)
        public HealthyBurger createBurger() {
            return new HealthyBurger();//ta sama metoda ale inny return - to właśnie jest covariant return type - stała relacja z rodzicem metody ale inny return, in other words: Burger jest rodzicem, HealthyBurger jest dzieckiem, więc metoda createBurger w klasie HealthyBurgerFactory może return any type of burger
        }
    }
}
