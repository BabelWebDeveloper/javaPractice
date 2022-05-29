package BasicClass;

import java.math.BigDecimal;

public class Pizza {
    private static final BigDecimal CENA_PODSTAWOWA = new BigDecimal(12);

    public BigDecimal getPrice() {
        return CENA_PODSTAWOWA;
    }

    @Override
    public String toString() {
        return "Pizza";
    }
}
