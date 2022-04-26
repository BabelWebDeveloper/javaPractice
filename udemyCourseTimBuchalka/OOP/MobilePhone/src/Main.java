import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone contactsList = new MobilePhone();

    public static void main(String[] args) {
        addContact("John", 123);
        addContact("Jim", 456);
        contactsList.printContactsList();
        contactsList.modifyContact(0,"Przemo",667);
        contactsList.printContactsList();
        contactsList.removeContact(1);
        addContact("Kinga", 123);
        addContact("Baśka", 456);
        addContact("Jola", 123);
        addContact("Stasiu", 456);
        contactsList.printContactsList();
    }

    public static void addContact(String name, int number) {
        contactsList.addContact(name,number);
    }
}
