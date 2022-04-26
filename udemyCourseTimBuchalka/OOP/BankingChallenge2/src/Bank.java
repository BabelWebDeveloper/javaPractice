import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branchList;

    public Bank(String name) {
        this.name = name;
        this.branchList = new ArrayList<>();
    }
//    Finders start here:
    public int findBranch(String name){
        for (int i = 0; i < this.branchList.size(); i++){
            Branch branch = this.branchList.get(i);
            if (branch.getBranchName().equals(name)){
                System.out.println("Bank.findBranch: Such branch already exist.");
                return i;
            }
        }
        System.out.println("Bank.findBranch: Such branch doesn't exist.");
        return -1;
    }

    public boolean customersValidation(String name){
        for (int i = 0; i < this.branchList.size(); i++){
            Branch branch = this.branchList.get(i);
            ArrayList<Customer> customers = branch.getCustomerList();
            for (int j = 0; j < customers.size(); j++){
                Customer findCustomer = customers.get(i);
                if (findCustomer.getName().equals(name)){
                    System.out.println("Bank.customersValidation: Such customer already exist!");
                    return true;
                }
                System.out.println("Bank.customersValidation: Such customer doesn't exist!");
                return false;
            }
        }
        System.out.println("Bank.customersValidation: Such branch doesn't exist!");
        return false;
    }
//    Finders end here.

//    Add new branch start here:
    public boolean addBranch(String name){
        int position = findBranch(name);
        if (position < 0){
            Branch newBranch = new Branch(name);
            this.branchList.add(newBranch);
            System.out.println("Bank.addBranch: Branch successfully added!");
            return true;
        }
        System.out.println("Bank.addBranch: Such branch already exist!");
        return false;
    }
//    Add new branch end here.

//    Add new customer start here:
    public boolean addCustomer(String branchName, String customerName, double amount){
        int branchPosition = findBranch(branchName);
        if (branchPosition >= 0){
            Branch branch = this.branchList.get(branchPosition);
            if (!customersValidation(customerName)){
                if (branch.addCustomer(customerName,amount)){
                    System.out.println("Bank.addCustomer: Customer successfully added!");
                    return true;
                }
                return false;
            }
            System.out.println("Bank.addCustomer: Such customer already exist!");
            return false;
        } else {
            System.out.println("Bank.addCustomer: Such branch doesn't exist!");
            return false;
        }
    }
//    Add new customer end here.

//    Add new customer transaction start here:
    public boolean addTransaction(String branchName, String customerName, double value){
        int branchPosition = findBranch(branchName);
        if (branchPosition >= 0){
            Branch branch = this.branchList.get(branchPosition);
            int customerPosition = branch.findCustomer(customerName);
            if (customerPosition >= 0){
                ArrayList<Customer> customers = branch.getCustomerList();
                Customer customer = customers.get(customerPosition);
                if (customer.createTransaction(value)){
                    System.out.println("Bank.addTransaction: Transaction successfully added!");
                    return true;
                }
                System.out.println("Bank.addTransaction: Transaction error!");
                return false;
            }
            System.out.println("Bank.addTransaction: Such customer doesn't exist!");
            return false;
        }
        System.out.println("Bank.addTransaction: Such branch doesn't exist!");
        return false;
    }
//    Add new customer transaction end here.

//    Printers start here:
    public void printAllBranches(){
        for (int i = 0; i < this.branchList.size(); i++){
            System.out.println((i+1) + ". " + this.branchList.get(i).getBranchName());
        }
    }

    public void printCustomersFromBranch(String branchName, String customerName){
        int branchPosition = findBranch(branchName);
        if (branchPosition >= 0){
            for (int i = 0; i < this.branchList.size(); i++){
                Branch branch = this.branchList.get(i);
                System.out.println((i+1) + ". " + branch + " from branch: " + branch.getBranchName());
            }
        }
    }

    public void printAllCustomers(){
        for (int i = 0; i < this.branchList.size(); i++){
            Branch branch = this.branchList.get(i);
            ArrayList<Customer> customers = branch.getCustomerList();
            for (int j = 0; j < customers.size(); j++){
                Customer findCustomer = customers.get(i);
                System.out.println("Customer from branch: " + branch.getBranchName() + " -> " + (j+1) + ". " + findCustomer.getName() + " actual amount: " + findCustomer.getAmount());
            }
        }
    }

    public void printCustomerTransaction(String customerName){

    }
//    Printers end here.


//    Getters:
    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranchList() {
        return branchList;
    }
}
