import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<Order> orders;

    public Shop(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public boolean addOrder(String orderName, String customerName, double value){
        Order order = new Order(orderName,customerName,value);
        return this.orders.add(order);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}
