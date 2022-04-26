import javax.xml.stream.Location;
import java.util.Locale;

public class Burger {
    private String name;
    private String rollType;
    private String meat;
    private double price;

    private double ingredientsBill = 0;
    private double jalapenoPrice = 5.50;
    private double cheddarPrice = 8;
    private double onionPrice = 1.50;
    private double avocadoPrice = 7;
    private int jalapenoQuantity = 0;
    private int cheddarQuantity = 0;
    private int onionQuantity = 0;
    private int avocadoQuantity = 0;


    private String ingredient1;
    private String ingredient2;
    private String ingredient3;
    private String ingredient4;
    private String ingredient5;
    private String ingredient6;

    public Burger(String name, String rollType, String meat, double price) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
    }

    public boolean validate(String ingredient){
        if (ingredient == "jalapeno" || ingredient == "cheddar" || ingredient == "onion" || ingredient == "avocado"){
            return true;
        } else {
            return false;
        }
    }

    public void assignIngredients(String ingredient, String location){
        if (validate(ingredient)){
            location = ingredient;
            quantity(ingredient);
            System.out.println(ingredient + " successfully added.");
        } else {
            System.out.println("Wrong ingredient!");
        }
    }

//    METHODS OVERLOADING:
    public void addIngredients(String ingredient1){
        assignIngredients(ingredient1,this.ingredient1);
    }

    public void addIngredients(String ingredient1, String ingredient2){
        assignIngredients(ingredient1,this.ingredient1);
        assignIngredients(ingredient2,this.ingredient2);
    }

    public void addIngredients(String ingredient1, String ingredient2, String ingredient3){
        assignIngredients(ingredient1,this.ingredient1);
        assignIngredients(ingredient2,this.ingredient2);
        assignIngredients(ingredient3,this.ingredient3);
    }

    public void addIngredients(String ingredient1, String ingredient2, String ingredient3, String ingredient4){
        assignIngredients(ingredient1,this.ingredient1);
        assignIngredients(ingredient2,this.ingredient2);
        assignIngredients(ingredient3,this.ingredient3);
        assignIngredients(ingredient4,this.ingredient4);
    }

    public void quantity(String ingredient){
        switch (ingredient){
            case "jalapeno":
                jalapenoQuantity++;
                break;
            case "avocado":
                avocadoQuantity++;
                break;
            case "onion":
                onionQuantity++;
                break;
            case "cheddar":
                cheddarQuantity++;
                break;
        }
    }

    public void bill(){
        double jalapenoTotalPrice = 0;
        double cheddarTotalPrice = 0;
        double onionTotalPrice = 0;
        double avocadoTotalPrice = 0;
        System.out.println("Here's your bill:");
        if (jalapenoQuantity > 0){
            jalapenoTotalPrice += jalapenoPrice * jalapenoQuantity;
            ingredientsBill += jalapenoTotalPrice;
            System.out.println("Successfully added " + jalapenoQuantity + " jalapeno for " + jalapenoTotalPrice);
        }
        if (cheddarQuantity > 0){
            cheddarTotalPrice += cheddarPrice * cheddarQuantity;
            ingredientsBill += cheddarTotalPrice;
            System.out.println("Successfully added " + cheddarQuantity + " cheddar for " + cheddarTotalPrice);
        }
        if (onionQuantity > 0){
            onionTotalPrice += onionPrice * onionQuantity;
            ingredientsBill += onionTotalPrice;
            System.out.println("Successfully added " + onionQuantity + " onion for " + onionTotalPrice);
        }
        if (avocadoQuantity > 0){
            avocadoTotalPrice += avocadoPrice * avocadoQuantity;
            ingredientsBill += avocadoTotalPrice;
            System.out.println("Successfully added " + avocadoQuantity + " avocado for " + avocadoTotalPrice);
        }
        System.out.println("Total payment: " + (price + ingredientsBill));
    }



//    POTEM USUNĄĆ NIEPOTRZEBNE GETTERSY !!!
    public String getName() {
        return name;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getIngredient1() {
        return ingredient1;
    }

    public String getIngredient2() {
        return ingredient2;
    }

    public String getIngredient3() {
        return ingredient3;
    }

    public String getIngredient4() {
        return ingredient4;
    }
}
