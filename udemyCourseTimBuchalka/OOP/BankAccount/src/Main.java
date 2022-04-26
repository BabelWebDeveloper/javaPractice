public class Main {

    public static void main(String[] args) {

        Account account = new Account();/*to jest konstruktor*/

        account.setAccountNumber(1000);
        account.setBallance(16500.25);
        account.setCustomerName("John Wick");
        account.setEmail("john@wickAR15.com");
        account.setPhoneNumber(123456789);

        System.out.println(account.getAccountNumber());
        System.out.println(account.getBallance());
        System.out.println(account.getCustomerName());
        System.out.println(account.getEmail());
        System.out.println(account.getPhoneNumber());

        System.out.println();
        account.depositFounds(1000.75);
        System.out.println("After deposit: " + account.getBallance());

        System.out.println();
        System.out.println(account.withdrawalFounds(17501));
        System.out.println("After withdrawal: " + account.getBallance());

    }
}
