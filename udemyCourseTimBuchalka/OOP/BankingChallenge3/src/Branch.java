import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customerArrayList;

    public Branch(String name) {
        this.name = name;
        this.customerArrayList = new ArrayList<>();
    }

    public static Branch createBranch(String name){
        return new Branch(name);
    }

//    Finders:
    public int findCustomer(Customer customer){
        return this.customerArrayList.indexOf(customer);
    }
    public int findCustomer(String customerName){
        for (int i = 0; i < this.customerArrayList.size(); i++){
            Customer customer = this.customerArrayList.get(i);
            if (customer.getName().equals(customerName)){
                return i;
            }
        }
        System.out.println("Branch.findCustomer: Such customer doesn't exist.");
        return -1;
    }

//    Adders:
    public boolean addCustomer(Customer customer){
        if (findCustomer(customer) >= 0){
            System.out.println("Branch.addCustomer: Such customer already exist.");
            return false;
        }
        this.customerArrayList.add(customer);
        System.out.println("Branch.addCustomer: Customer successfully added!");
        return true;
    }

    public boolean addTransaction(Customer customer, double value){
        int position = findCustomer(customer);
        if (position < 0){
            System.out.println("Branch.addCustomer: Such customer doesn't exist.");
            return false;
        }
        Customer customerTransaction = this.customerArrayList.get(position);
        customerTransaction.createTransaction(value);
        System.out.println("Branch.addCustomer: Transaction successfully added!");
        return true;
    }

//    Printers:
    public void printCustomers(){
        for (int i = 0; i < this.customerArrayList.size(); i++){
            Customer customer = this.customerArrayList.get(i);
            System.out.println((i+1) + ". " + customer.getName() + ", actual amount: " + customer.getAmount());
        }
    }

    public void printTransactions(Customer customer){
        if (findCustomer(customer) < 0){
            System.out.println("Branch.printTransactions: Such customer doesn't exist!");
        } else {
            ArrayList<Double> transactionList = customer.getTransactionArrayList();
            for (int i = 0; i < transactionList.size(); i++){
                System.out.println((i+1) + ". " + transactionList.get(i));
            }
        }
    }

//    Getters:
    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }
}
