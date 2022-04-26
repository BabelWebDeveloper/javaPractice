import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {/*SETTER*/
//        here we can put e.g. validation:
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("3er")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }

    }

    public String getModel() {/*getModel - method to print model - GETTER*/
        return this.model;
    }
}
