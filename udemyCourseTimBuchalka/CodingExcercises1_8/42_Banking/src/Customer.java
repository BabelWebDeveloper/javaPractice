import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {//here is an extra parameter from method below
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialAmount);//assigning initial amount as a regular transaction by calling addTransaction method once at using constructor
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
