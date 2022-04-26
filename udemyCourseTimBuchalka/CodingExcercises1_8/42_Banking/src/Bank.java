import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    private Branch findBranch(String name){
        for (int i = 0; i < this.branches.size(); i++){
            Branch branch = this.branches.get(i);
            if (branch.getName().equals(name)){
                return this.branches.get(i);
            }
        }
        return null;
    }

    public boolean addBranch(String branchName){
        if (findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.newCustomer(customerName,initialAmount);
        }
        return false;
    }

    public boolean addTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.addTransaction(customerName,amount);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if (branch != null){
            System.out.println("Customers details for branch " + branch.getName());
            ArrayList<Customer> customerBranchList = branch.getCustomers();
            for (int i = 0; i < customerBranchList.size(); i++){
                Customer customer = customerBranchList.get(i);
                System.out.println((i+1) + ". " + customer.getName());
                if (showTransactions){
                    ArrayList<Double> transactionsCustomerList = customer.getTransactions();
                    System.out.println("List of transactions:");
                    for (int j = 0; j < transactionsCustomerList.size(); j++){
                        Double transaction = transactionsCustomerList.get(j);
                        System.out.println((j+1) + ". " + transaction);
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
