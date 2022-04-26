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
                return branch;
            }
        }
        return null;
    }

    public boolean addBranch(String name){
        Branch branch = findBranch(name);
        if (branch == null){
            this.branches.add(new Branch(name));
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

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.addCustomerTransaction(customerName,transaction);//customer validation is in Branch class, so we just add method
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean transactionList){
        System.out.println("Customer details for branch " + branchName);
        Branch branch = findBranch(branchName);
        if (branch != null){
            ArrayList<Customer> customerArrayList = branch.getCustomers();
            for (int i = 0; i < customerArrayList.size(); i++){
                Customer customer = customerArrayList.get(i);
                System.out.println("Customer: " + customer.getName() + "[" + (i+1) + "]");
                if (transactionList){
                    System.out.println("Transactions");
                    ArrayList<Double> transactionsArrayList = customer.getTransactions();
                    for (int j = 0; j < transactionsArrayList.size(); j++){
                        Double transactions = transactionsArrayList.get(j);
                        System.out.println("[" + (i+1) + "] Amount  " + transactions);
                    }
                }
            }
            return true;
        }
        return false;
    }
}
