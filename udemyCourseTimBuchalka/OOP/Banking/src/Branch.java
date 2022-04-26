import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    private Customer findCustomer(String name){
        for (int i = 0; i < this.customers.size(); i++){
            Customer customer = this.customers.get(i);
            if (customer.getName().equals(name)){
                return customer;
            }
        }
        return null;
    }

    public boolean newCustomer(String name, double initialAmount){
        Customer customer = findCustomer(name);
        if (customer == null){
            this.customers.add(new Customer(name,initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double transaction){
        Customer customer = findCustomer(name);
        if (customer != null){
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
