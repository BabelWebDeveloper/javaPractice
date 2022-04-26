public class VipCustomer {

    private String name;
    private int creditLimit;
    private String emailAddress;

//    3 domyślne parametry:
    public VipCustomer() {
        this("Przemek",50000,"email@vom");
    }

//    2 domyślne parametry:
    public VipCustomer(String name, int creditLimit) {/*tutaj wpisujemy to co ma być pobierane z maina*/
        this(name, creditLimit, "email@voms");/*tutaj wartości domślne*/
    }

//    0 domyslnych parametrów - wszystko z maina:
    public VipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

//    getters:
    public String getName() {
        return this.name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
