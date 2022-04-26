import java.util.ArrayList;

public class Customer {
    private String name;
    private double amount;
    private ArrayList<Double> transactionArrayList;

    public Customer(String name, double amount) {
        this.name = name;
        this.amount = amount;
        this.transactionArrayList = new ArrayList<>();
    }

    public static Customer createCustomer(String name, double amount){
        return new Customer(name,amount);
    }

    public ArrayList<Double> createTransaction(double value){
        if (this.amount >= value){
            this.transactionArrayList.add(value);
            this.amount -= value;
            System.out.println("Customer.createTransaction: Transaction successfully created.");
            return this.transactionArrayList;
        } else {
            System.out.println("Customer.createTransaction: Error, not enough money!");
            return null;
        }
    }

    //    Getters:
    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public ArrayList<Double> getTransactionArrayList() {
        return transactionArrayList;
    }

}
