public class PayByPayPal implements  PaymentStrategy{

    private String email;
    private String password;
    @Override
    public void collectPaymentDetails() {
        // zebrane dane konta PayPal
        email = "email@email.com";
        password = "password";
    }

    @Override
    public boolean validatePaymentDetails() {
//        walidacja zebranych danych
        return false;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Płatność " + amount + " przez PayPal.");
    }

}
