public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
//        W tym momecie dowolna metoda płatności może być dodawana dynamicznie:

        paymentService.setStrategy(new PayByCreditCard());//dodanie nowej opcji płatności
        paymentService.processOrder();//rozpoczęcie procesu płatności
    }
}
