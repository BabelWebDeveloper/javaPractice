package Decorators;

import BasicClass.Pizza;

import java.math.BigDecimal;

public class PizzaAnanas extends Pizza {
    private static final BigDecimal CENA_ANANAS = new BigDecimal(3);
    private final Pizza pizzaPodstawowa;

    public PizzaAnanas(Pizza pizzaPodstawowa) {
        this.pizzaPodstawowa = pizzaPodstawowa;
    }

    @Override
    public BigDecimal getPrice() {
        return pizzaPodstawowa.getPrice().add(CENA_ANANAS);
    }
}
