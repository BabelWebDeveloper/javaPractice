public class Main {

    public static void main(String[] args) {

        VipCustomer customer = new VipCustomer();

        System.out.println("Customer 1, Name: " + customer.getName() + ", credit limit: " + customer.getCreditLimit() + ", email: " + customer.getEmailAddress());

        VipCustomer customer2 = new VipCustomer("Kinga", 50000);

        System.out.println("Customer 2, Name: " + customer2.getName() + ", credit limit: " + customer2.getCreditLimit() + ", email: " + customer2.getEmailAddress());

        VipCustomer customer3 = new VipCustomer("Przemek",40000,"@email.pl");

        System.out.println("Customer 3, Name: " + customer3.getName() + ", credit limit: " + customer3.getCreditLimit() + ", email: " + customer3.getEmailAddress());

    }
}
