public class Order {
    private String orderName;
    private String customerName;
    private double value;

    public Order(String orderName, String customerName, double value) {
        this.orderName = orderName;
        this.customerName = customerName;
        if (value < 0){
            this.value = 0;
        } else {
            this.value = value;
        }
    }

    public String getOrderName() {
        return orderName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getValue() {
        return value;
    }
}
