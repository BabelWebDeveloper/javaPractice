public class DeluxeBurger extends Burger{
    private String chips;
    private String drinks;

    public DeluxeBurger(String meat,String chips, String drinks) {
        super("Deluxe burger", "bread", meat, 30);
        if (chips == "crunchips" || chips == "lays"){
            this.chips = chips;
            System.out.println(getChips() + " successfully added.");
        } else {
            System.out.println("Wrong chips selected!");
        }
        if (drinks == "tequila" || drinks == "whisky"){
            this.drinks = drinks;
            System.out.println(getDrinks() + " successfully added.");
        } else {
            System.out.println("Wrong drinks selected!");
        }
    }

    @Override
    public void addIngredients(String ingredient1) {
        super.addIngredients(ingredient1);
    }

    @Override
    public void addIngredients(String ingredient1, String ingredient2) {
        super.addIngredients(ingredient1, ingredient2);
    }

    @Override
    public void addIngredients(String ingredient1, String ingredient2, String ingredient3) {
        super.addIngredients(ingredient1, ingredient2, ingredient3);
    }

    @Override
    public void addIngredients(String ingredient1, String ingredient2, String ingredient3, String ingredient4) {
        super.addIngredients(ingredient1, ingredient2, ingredient3, ingredient4);
    }

    public String getChips() {
        return chips;
    }

    public String getDrinks() {
        return drinks;
    }
}
