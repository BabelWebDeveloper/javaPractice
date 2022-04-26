public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

//    public Account() {
//        this("56789", 2.50, "Default name", "Default address", "default phone");
//        System.out.println("Empty constructor called");
//    }
    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999",100.55, customerName, customerEmailAddress, customerPhoneNumber);/*set default number and default ballance, name, email and phone are to be passed*/
    }

// getters:
    public String getNumber() {
        return number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public double getBalance() {
        return balance;
    }
}
