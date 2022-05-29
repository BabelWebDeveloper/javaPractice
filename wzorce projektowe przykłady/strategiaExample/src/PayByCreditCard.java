public class PayByCreditCard implements  PaymentStrategy{

    private CreditCard card;
    @Override
    public void collectPaymentDetails() {
        // zebrane dane karty kredytowej
        card = new CreditCard("numerKarty", "expityDate" , "cvv", 1000000);
    }

    @Override
    public boolean validatePaymentDetails() {
//        walidacja zebranych danych
        return false;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Płatność " + amount + " przez kartę kredytową");
        card.setAmount(card.getAmount() - amount);
    }
}
