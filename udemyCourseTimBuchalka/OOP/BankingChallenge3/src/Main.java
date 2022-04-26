import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank("NewBank");

    public static void main(String[] args) {

        boolean quit = false;
        printInstructions();

        while (!quit){
            int actions = scanner.nextInt();
            scanner.nextLine();

            switch (actions){
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1:
                    printInstructions();
                    break;
                case 2:
                    addingCustomer();
                    break;
                case 4:
                    bank.printAllCustomers();
                    break;
                case 5:
                    addingTransactionBetter();
                    break;
                case 6:
                    addingBranch();
                    break;
                case 7:
                    bank.printBranches();
                    break;
                case 8:
                    findCustomerInBranch();
                    break;
                case 9:
                    printTransactionsBetter();
                    break;
            }
        }
    }
    private static void addingBranch(){
        System.out.println("Enter name of branch:");
        String branchName = scanner.nextLine();
        int branchPosition = bank.findBranch(branchName);
        if (branchPosition >= 0){
            System.out.println("Such branch already exist!");
        } else {
            Branch branch = Branch.createBranch(branchName);
            bank.addBranch(branch);
        }
    }

    private static void addingCustomer(){
        System.out.println("Enter name of branch:");
        String name = scanner.nextLine();
        int branchPosition = bank.findBranch(name);
        if (branchPosition < 0){
            System.out.println("Such branch no exist!");
        } else {
            Branch branch = bank.getBranchArrayList().get(branchPosition);
            System.out.println("Enter name of new customer:");
            String customerName = scanner.nextLine();
            int customerPosition = branch.findCustomer(customerName);
                if (customerPosition >= 0){
                    System.out.println("Such customer exist!");
                } else {
                    System.out.println("Enter amount of new customer's account:");
                    double amount = scanner.nextDouble();
                    Customer customer = Customer.createCustomer(customerName,amount);
                    bank.addCustomer(branch,customer);
                }
        }
    }

    private static void addingTransaction(){
        System.out.println("Enter name of branch:");
        String branchName = scanner.nextLine();
        int branchPosition = bank.findBranch(branchName);
        if (branchPosition < 0){
            System.out.println("Branch no exist!");
        } else {
            Branch branch = bank.getBranchArrayList().get(branchPosition);
            System.out.println("Enter name of customer:");
            String customerName = scanner.nextLine();
            int customerPosition = branch.findCustomer(customerName);
            if (customerPosition < 0){
                System.out.println("Customer no exist.");
            } else {
                System.out.println("Enter value of customer's transaction:");
                double value = scanner.nextDouble();
                Customer customer = branch.getCustomerArrayList().get(customerPosition);
                bank.addTransaction(branch,customer,value);
            }
        }
    }

    private static void addingTransactionBetter(){
        System.out.println("Enter name of customer:");
        String customerName = scanner.nextLine();
        Customer customer = bank.findCustomerInBranch(customerName);
        if (customer != null){
            System.out.println("Enter value of transaction:");
            double value = scanner.nextDouble();
            customer.createTransaction(value);
        }
    }

    private static void printTransactionsBetter(){
        System.out.println("Enter name of customer:");
        String customerName = scanner.nextLine();
        Customer customer = bank.findCustomerInBranch(customerName);
        if (customer != null){
            ArrayList<Double> transactionList = customer.getTransactionArrayList();
            for (int i = 0; i < transactionList.size(); i++){
                System.out.println((i+1) + ". " + transactionList.get(i));
            }
        }
    }

    private static void findCustomerInBranch(){
        System.out.println("Enter name of customer to be found:");
        String name = scanner.nextLine();
        Customer customer = bank.findCustomerInBranch(name);
        if (customer != null){
            System.out.println(customer.getName() + ", amount: " + customer.getAmount());
        } else {
            System.out.println("Such customer doesn't found.");
        }
    }

    private static void printInstructions(){
        System.out.println("\nAvailable actions:\n");
        System.out.println("0  - to shutdown\n" +
                "1  - to print instructions\n" +
                "2  - to add a new customer\n"+
                "4  - to print customers\n" +
                "5  - to add a new transaction\n" +
                "6  - to add a new branch\n" +
                "7  - to print branches\n" +
                "8  - to find customer\n" +
                "9  - print transactions\n"
        );
        System.out.println("Choose your action: ");
    }
}
