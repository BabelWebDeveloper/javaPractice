import java.util.ArrayList;

public class Branch{
    private String branchName;
    private ArrayList<Customer> customerList;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customerList = new ArrayList<>();
    }

//    Creators start here:
    public Branch createBranch(String name){
        return new Branch(name);
    }
//    Creators end here.

//    Finders start here:
    public int findCustomer(String name){
        for (int i = 0; i < this.customerList.size(); i++){
            Customer customer = this.customerList.get(i);
            if (customer.getName().equals(name)){
                return i;
            }
        }
        System.out.println("Branch.findCustomer: Such customer doesn't exist.");
        return -1;
    }
//    Finders end here.

//    Add new customer start here:
    public boolean addCustomer(String name, double amount){
        if (findCustomer(name) < 0){
            Customer newCustomer = Customer.re;
            this.customerList.add(newCustomer);
            System.out.println("Branch.addCustomer: Customer successfully added!");
            return true;
        }
        System.out.println("Branch.addCustomer: That customer already exist!");
        return false;
    }
//    Add new customer end here.

//    Add new transaction start here:
    public boolean addTransaction(String name, double value){
        int position = findCustomer(name);
        if (position > 0){
            Customer customer = this.customerList.get(position);
            if (customer.createTransaction(value)){
                return true;
            }
            System.out.println("Branch.addTransaction: Validation error!");
            return false;
        }
        System.out.println("Branch.addTransaction: Such customer doesn't exist.");
        return false;
    }
//    Add new transaction end here.

//    Printers start here:
    public void printCustomers(){
        System.out.println("Customer list from branch: " + this.branchName);
        for (int i = 0; i < this.customerList.size(); i++){
            Customer customer = this.customerList.get(i);
            System.out.println((i+1) + ". " + customer.getName() + ", amount is: " + customer.getAmount());
        }
    }

    public void printLastTransactions(String name){
        int position = findCustomer(name);
        if (position >= 0){
            Customer customer = this.customerList.get(position);
            ArrayList<Double> transactions = customer.getTransactions();
            System.out.println("list of transactions by " + customer.getName());
            for (int i = 0; i < transactions.size(); i++){
                System.out.println((i+1) + ". " + transactions.get(i));
            }
        }
        System.out.println("Branch.printLastTransactions: Such customer doesn't exist.");
    }
//    Printers end here.

//    Getters:
    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
}
