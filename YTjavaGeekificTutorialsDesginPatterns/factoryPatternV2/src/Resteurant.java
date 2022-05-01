public abstract class Resteurant {//przez rodzica można tworzyć klasy dziecka
    public Burger orderBurger(){
        Ingredient Ingredient = prepareIngredients();//metoda createBurger() zwraca obiekt burger
        Ingredient.prepare();//zwrócony obiekt ma dostęp do metody prepare
        return burger;
    }
    public abstract Ingredient prepareIngredients();//klasa absrakcyjna po to żeby uzyskać dostęp do metody zawartej w "dziecku"
}