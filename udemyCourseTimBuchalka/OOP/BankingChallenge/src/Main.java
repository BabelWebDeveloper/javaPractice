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
            }
        }
    }

    private static void newBranch(){
        System.out.println("Enter name of new branch:");
        String name = scanner.nextLine();
        Branch newBranch =  Branch.createBranch(name);
        bank.addBranch(newBranch);
    }

    private static void newCustomer(){
        System.out.println("Enter name of new customer:");
        String name = scanner.nextLine();
        if (!bank.findCustomerAll(name)){
            String branchName = scanner.nextLine();
            if (bank.findBranch(branchName) >= 0){
                double amount = scanner.nextDouble();
                Customer customer = new Customer(name,amount);
                bank.addCustomer(branchName,customer,amount);
            }
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
