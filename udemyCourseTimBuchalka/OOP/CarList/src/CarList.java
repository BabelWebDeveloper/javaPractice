public class CarList {

    private String brand;
    private String model;
    private double price;
    private boolean tuning;

    public CarList(String brand, String model, double price, boolean tuning) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.tuning = tuning;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public boolean isTuning() {
        return tuning;
    }
}
