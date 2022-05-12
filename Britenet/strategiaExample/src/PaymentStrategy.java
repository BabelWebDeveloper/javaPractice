public interface PaymentStrategy {
    void collectPaymentDetails();
    boolean validatePaymentDetails();
    void pay(double amount);
}
