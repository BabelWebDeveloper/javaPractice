import java.util.ArrayList;

public class Customer {
    private String name;
    private double amount;
    private ArrayList<Double> transactions;

    public Customer(String name, double amount) {
        this.name = name;
        this.amount = amount;
        this.transactions = new ArrayList<>();
    }

//    Creators start here:
    public Customer createCustomer(String name, double amount){
        return new Customer(name,amount);
    }

    public boolean createTransaction(double value){
        if (this.amount < value){
            System.out.println("Not enough money!");
            return false;
        }
        this.transactions.add(value);
        this.amount -= value;
        System.out.println("Transaction passed.");
        return true;
    }
//    Creators end here.

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
