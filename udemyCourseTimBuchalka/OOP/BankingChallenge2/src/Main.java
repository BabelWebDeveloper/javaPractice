import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank("Przemos Jewish bank of Poland");

    public static void main(String[] args) {

        boolean quit = false;
        printInstructions();
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    quit = true;
                    break;
                case 1:
                    newBranch();
                    break;
                case 2:
                    newCustomer();
                    break;
                case 3:
                    newTransaction();
                    break;
                case 4:
                    bank.printAllCustomers();
                    break;
                case 5:
                    bank.printAllBranches();
                    break;
                default:
                    System.out.println("Wrong choice! Type one of this and press enter:");
                    printInstructions();
            }
        }
    }

    private static void newBranch(){
        System.out.println("Enter name of new branch:");
        String branchName = scanner.nextLine();
        if (bank.findBranch(branchName) < 0){
            bank.addBranch(branchName);
            System.out.println("Main.newBranch: branch successfully added!");
        } else {
            System.out.println("Main.newBranch: adding branch error.");
        }
    }

    private static void newCustomer(){
        System.out.println("Enter name of new customer:");
        String customerName = scanner.nextLine();
        if (!bank.customersValidation(customerName)){
            System.out.println("Enter name of branch which this customer will be added:");
            String branchName = scanner.nextLine();
            if (bank.findBranch(branchName) >= 0){
                System.out.println("Enter amount of new customer:");
                double amount = scanner.nextDouble();
                bank.addCustomer(branchName,customerName,amount);
            } else {
                System.out.println("Main.newBranch: finding branch error.");
            }
        } else {
            System.out.println("Main.newBranch: finding customer error.");
        }

    }

    public static void newTransaction(){//skończyłem tutaj
        System.out.println("Enter name of customer:");
        String customerName = scanner.nextLine();
        if (bank.customersValidation(customerName)){
            System.out.println("Enter name of branch which this customer will be added:");
            String branchName = scanner.nextLine();
            if (bank.findBranch(branchName) >= 0){
                System.out.println("Enter value of new transaction:");
                double value = scanner.nextDouble();
                bank.addTransaction(branchName,customerName,value);
            } else {
                System.out.println("Main.newBranch: finding branch error.");
            }
        } else {
            System.out.println("Main.newBranch: finding customer error.");
        }
    }

    private static void printInstructions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to add new branch\n" +
                "2  - to add new customer\n" +
                "3  - to add new transaction\n" +
                "4  - to print customer list\n" +
                "5  - to print branch list\n" +
                "6  - to print customer transactions");
        System.out.println("Choose your action: ");
    }
}
