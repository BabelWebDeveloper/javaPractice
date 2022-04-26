public class Main {

    public static void main(String[] args) {

        Account timsAccount = new Account("Tim", "tim@email.com","12345");

        System.out.println("account number: " + timsAccount.getNumber() + ", name: " + timsAccount.getCustomerName() + ", email: " + timsAccount.getCustomerEmailAddress() + ", customer phone num: " + timsAccount.getCustomerPhoneNumber());

//        Account bobsAccount = new Account();
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
    }
}