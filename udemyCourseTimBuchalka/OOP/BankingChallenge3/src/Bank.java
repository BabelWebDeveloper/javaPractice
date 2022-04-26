import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branchArrayList;

    public Bank(String name) {
        this.name = name;
        this.branchArrayList = new ArrayList<>();
    }

//    Find customer:
    public int findCustomer(Branch branch, Customer customer){
        return branch.findCustomer(customer);
    }

    public int findCustomer(Branch branch, String name){
        return branch.findCustomer(name);
    }

    public Customer findCustomerInBranch(String name){
        for (int i = 0; i < this.branchArrayList.size(); i++){
            Branch branch = branchArrayList.get(i);
            ArrayList<Customer> customerArrayList = branch.getCustomerArrayList();
            for (int j = 0; j < customerArrayList.size(); j++){
                Customer customerToBeFound = customerArrayList.get(j);
                if (customerToBeFound.getName().equals(name)){
                    return customerToBeFound;
                }
            }
        }
        return null;
    }

//    Find branch:
    public int findBranch(Branch branch){
        return this.branchArrayList.indexOf(branch);
    }

    public int findBranch(String name){
        for (int i = 0; i < this.branchArrayList.size(); i++){
            Branch branch = this.branchArrayList.get(i);
            if (branch.getName().equals(name)){
                return i;
            }
        }
        System.out.println("Bank.findBranch: Such branch doesn't exist!");
        return -1;
    }

//    Adders:
    public boolean addCustomer(Branch branch, Customer customer){
        if (findBranch(branch) >= 0){
            branch.addCustomer(customer);
            return true;
        }
        return false;
    }

    public boolean addTransaction(Branch branch, Customer customer, double value){
        if (findBranch(branch) >= 0){
            int customerPosition = branch.findCustomer(customer);
            if (customerPosition >= 0){
                customer.createTransaction(value);
                return true;
            }
        }
        return false;
    }

    public boolean addBranch(Branch branch){
        if (findBranch(branch) >= 0){
            System.out.println("Bank.addBranch: Such branch exist!");
            return false;
        }
        branchArrayList.add(branch);
        System.out.println("Bank.addBranch: Branch successfully added!");
        return true;
    }

//    Printers:
    public void printBranches(){
        for (int i = 0; i < this.branchArrayList.size(); i++){
            Branch branch = this.branchArrayList.get(i);
            System.out.println((i+1) + ". " + branch.getName());
        }
    }

    public void printAllCustomers(){
        for (int i = 0; i < this.branchArrayList.size(); i++){
            Branch branch = this.branchArrayList.get(i);
            ArrayList<Customer> customerArrayList = branch.getCustomerArrayList();
            for (int j = 0; j < customerArrayList.size(); j++){
                Customer customer = customerArrayList.get(j);
                System.out.println("List of customers in branch: " + branch.getName() + ": " + customer.getName());
            }
        }
    }

    public void printTransactions(Branch branch, Customer customer){
        if (findBranch(branch) >= 0){
            branch.printTransactions(customer);
        } else {
            System.out.println("Bank.printTransactions: Branch no exist.");
        }
    }

    public void printTransactionsBetter(Customer customer){

    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranchArrayList() {
        return branchArrayList;
    }
}
