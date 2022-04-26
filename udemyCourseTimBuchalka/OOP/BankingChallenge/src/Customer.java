import java.util.ArrayList;

public class Customer {
    private String name;//name for validation
    private double amount;
    private ArrayList<Double> transactions;

    public Customer(String name,double amount) {
        this.name = name;
        this.amount = amount;
        this.transactions = new ArrayList<Double>();
    }

    public static Customer createCustomer(String name, double amount){
        return new Customer(name,amount);
    }

    public boolean createTransaction(double value){
        if (value <= this.amount){
            this.amount -= value;
            this.transactions.add(value);
            System.out.println("Transaction for " + this.name + " successfully added!");
            return true;
        }
        System.out.println(this.name + " doesn't have enough money!");
        return false;
    }

    public void printTransactions(){
        System.out.println("List of transactions by " + this.name);
        for (int i = 0; i < this.transactions.size(); i++){
            System.out.println((i+1) + ". " + this.transactions.get(i));
        }
    }

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
