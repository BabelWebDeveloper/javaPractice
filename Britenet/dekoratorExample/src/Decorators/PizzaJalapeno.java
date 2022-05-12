package Decorators;

import BasicClass.Pizza;

import java.math.BigDecimal;

public class PizzaJalapeno extends Pizza {
    private static final BigDecimal CENA_JALAPENO = new BigDecimal(5);
    private final Pizza pizzaPodstawowa;

    public PizzaJalapeno(Pizza pizzaPodstawowa) {
        this.pizzaPodstawowa = pizzaPodstawowa;
    }

    @Override
    public BigDecimal getPrice() {
        return pizzaPodstawowa.getPrice().add(CENA_JALAPENO);
    }
}
