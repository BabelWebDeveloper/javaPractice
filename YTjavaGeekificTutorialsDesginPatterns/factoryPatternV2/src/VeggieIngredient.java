public class VeggieBurgerPrepare extends Resteurant{
    @Override
    public Ingredient prepareIngredients() {
        System.out.println("Veggie is preparing...");
        return new Ingredient();
    }
}