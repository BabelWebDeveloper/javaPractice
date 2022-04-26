public class Account {

    private int accountNumber;
    private double ballance;
    private String customerName;
    private String email;
    private int phoneNumber;

//    setters:
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBallance(double ballance) {
        this.ballance = ballance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    getters:
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBallance() {
        return ballance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

//    deposit funds:
    public void depositFounds(double deposit) {
        this.ballance += deposit;
    }

//    withdrawal founds:
    public String withdrawalFounds(double withdrawal) {
        if (withdrawal > this.ballance) {
            return "You don't have that much money you motherfucker's piece of shit...";
        } else {
            this.ballance -= withdrawal;
            return "Here is your money!";
        }
    }
}
