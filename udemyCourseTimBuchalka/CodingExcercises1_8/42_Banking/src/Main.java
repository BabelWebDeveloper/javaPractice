public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Przemo's bank");

        bank.addBranch("Some1");

        bank.addCustomer("Some1","Kinia",50.05);
        bank.addCustomer("Some1", "Przemo", 175.34);
        bank.addCustomer("Some1", "Basia", 220.12);

        bank.addBranch("Branch2");
        bank.addCustomer("Branch2", "Bob", 150.54);

        bank.addTransaction("Some1","Kinia", 44.22);
        bank.addTransaction("Some1","Przemo", 12.44);
        bank.addTransaction("Some1","Basia", 1.65);

        bank.listCustomers("Some1",true);

//        bank.addBranch("Branch3");
        if (!bank.addCustomer("Branch3","Stasiek",500)){
            System.out.println("Error, branch doesn't exist!");
        }

    }
}
