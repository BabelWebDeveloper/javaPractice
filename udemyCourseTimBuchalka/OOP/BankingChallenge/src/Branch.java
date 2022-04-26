import java.util.ArrayList;

public class Branch {
    private String name;//name for validation
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public static Branch createBranch(String name){
        return new Branch(name);
    }

    public int findCustomer(Customer customer){
        int position = this.customers.indexOf(customer);
        if (position >= 0){
            return position;
        }
        return -1;
    }

    public int findCustomer(String name){
        for (int i = 0; i < this.customers.size(); i++){
            Customer customer = this.customers.get(i);
            if (customer.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public boolean addCustomer(Customer customer, double amount){
        String name = customer.getName();
        if (findCustomer(name) >= 0){
            System.out.println("That customer already exist!");
            return false;
        }
        Customer newCustomer = Customer.createCustomer(name,amount);
        this.customers.add(newCustomer);
        System.out.println("New customer successfully added!");
        return true;
    }

//    to poniżej zrobić od nowa omijając customer.createTransaction o ile się da
    public boolean addTransaction(Customer customer, double value){
        if (findCustomer(customer) >= 0){
            if (customer.createTransaction(value)){
                System.out.println("Transaction passed.");
                return true;
            }
            System.out.println("Transaction failed.");
            return false;
        }
        System.out.println("That customer doesn't exist!");
        return false;
    }

    public void printCustomers(){
        System.out.println("List of customers in branch: " + this.name);
        for (int i = 0; i < this.customers.size(); i++){
            System.out.println((i+1) + ". Name: " + this.customers.get(i).getName());
        }
    }

//    printCustomerTransactions - access form branch
    public void printCustomerTransactions(Customer customer){
        if (findCustomer(customer) >= 0){
            customer.printTransactions();
        }
        System.out.println("That customer doesn't exist!");
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
