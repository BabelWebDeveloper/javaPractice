import java.util.ArrayList;

public class Bank {
    private String name;//name for validation
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    private int findBranch(Branch branch){
        int position = this.branches.indexOf(branch);
        if (position >= 0){
            return position;
        }
        return -1;
    }

    public int findBranch(String name){
        for (int i = 0; i < this.branches.size(); i++){
            Branch branch = this.branches.get(i);
            if (branch.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    private int findCustomer(Customer customer){
        for (int i = 0; i < this.branches.size(); i++){
            Branch branch = this.branches.get(i);
            if (branch.findCustomer(customer) >= 0){
                return branch.getCustomers().indexOf(customer);
            }
        }
        return -1;
    }

    public boolean findCustomerAll(String name){
        for (int i = 0; i < this.branches.size(); i++){
            Branch branch = this.branches.get(i);
            ArrayList<Customer> customerList = branch.getCustomers();
            for (int j = 0; j < customerList.size(); j++){
                Customer customer = customerList.get(j);
                if (customer.getName().equals(name)){
                    return true;
                }
            }
        }
        return false;
    }

    public void addBranch(Branch branch){
        String name = branch.getName();
        if (findBranch(name) >= 0){
            System.out.println("That branch already exist!");
        } else {
            Branch newBranch = new Branch(name);
            this.branches.add(newBranch);
            System.out.println("New branch successfully added!");
        }
    }

    public boolean addCustomer(String branchName, Customer customer, double amount){//tutaj musi być customer name
        int branchPosition = findBranch(branchName);
        if (branchPosition >= 0){
            Branch branch = this.branches.get(branchPosition);
            if (!findCustomerAll(customer.getName())){
                if (branch.addCustomer(customer,amount)){
                    System.out.println("New customer successfully added!");
                    return true;
                }
                System.out.println("Customer validation error!");
                return false;
            }
            System.out.println("That customer already exist!");
            return false;
        }
        System.out.println("That branch doesn't exist!");
        return false;
    }

//    public boolean addCustomer(String branchName, String customerName, double amount){//tutaj musi być customer name
//        int branchPosition = findBranch(branchName);
//        if (branchPosition >= 0){
//            Branch branch = this.branches.get(branchPosition);
//            if (!findCustomerAll(customer.getName())){
//                if (branch.addCustomer(customer,amount)){
//                    System.out.println("New customer successfully added!");
//                    return true;
//                }
//                System.out.println("Customer validation error!");
//                return false;
//            }
//            System.out.println("That customer already exist!");
//            return false;
//        }
//        System.out.println("That branch doesn't exist!");
//        return false;
//    }

    public boolean addTransaction(Branch branch, Customer customer, double value){//tutaj poprawić - szukać transakcji klienta bez wpisywania brancha
        if (findBranch(branch) >= 0){
            if (branch.findCustomer(customer) >= 0){
                if (branch.addTransaction(customer,value)){
                    return true;
                }
                System.out.println("Transaction error!");
                return false;
            }
            System.out.println("That customer doesn't exist!");
            return false;
        }
        System.out.println("That branch doesn't exist!");
        return false;
    }

//    public boolean addTransaction(String branchName, String customerName, double value){//tutaj poprawić - szukać transakcji klienta bez wpisywania brancha
//        if (findBranch(branch) >= 0){
//            if (branch.findCustomer(customer) >= 0){
//                if (branch.addTransaction(customer,value)){
//                    return true;
//                }
//                System.out.println("Transaction error!");
//                return false;
//            }
//            System.out.println("That customer doesn't exist!");
//            return false;
//        }
//        System.out.println("That branch doesn't exist!");
//        return false;
//    }

    public void printCustomersInBranch(Branch branch){
        if (findBranch(branch) >= 0){
            branch.printCustomers();
        }
        System.out.println("That branch doesn't exist!");
    }

    public boolean printCustomerTransactions(Customer customer){
        if (findCustomer(customer) >= 0){
            customer.printTransactions();
            return true;
        }
        System.out.println("That customer doesn't exist!");
        return false;
    }


    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
}
