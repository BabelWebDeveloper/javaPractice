public class HealthyBurger extends BaseBurger{
    public HealthyBurger(String meat) {
        super("Healthy burger", "brown rye bread roll", meat, 24);
        setAdditionalLimit(4);
    }
}
