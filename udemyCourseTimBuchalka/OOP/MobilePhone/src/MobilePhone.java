import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> contactsList = new ArrayList<Contacts>();

    public void addContact(String name, int number){
        addContact(new Contacts(name,number));
    }

    private void addContact(Contacts contacts){
        contactsList.add(contacts);
    }

    public void printContactsList(){
        System.out.println("You have " + contactsList.size() + " contacts in your contacts list");
        for(int i=0; i< contactsList.size(); i++) {
            System.out.println((i+1) + ". " + contactsList.get(i));
        }
    }

    public void modifyContact(int index, String name, int number) {
        contactsList.set(index, new Contacts(name,number));
        System.out.println("Contact number: " + (index + 1) + " has been modified.");
    }

    public void removeContact(int index) {
        contactsList.remove(index);
        System.out.println("Contact number: " + (index + 1) + " has been deleted.");
    }

    public void findItem(String index){
        boolean index1 = contactsList.contains(index);
        System.out.println(index1);
    }
}
