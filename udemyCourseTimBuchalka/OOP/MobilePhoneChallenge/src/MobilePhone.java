import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name){
        for (int i = 0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        int result = findContact(name);
        if (result >= 0){
            return this.myContacts.get(result);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact list:");
        for (int i = 0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            System.out.println((i+1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0) {
            return false;
        } else {
            this.myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int result = findContact(oldContact);
        if (result >= 0){
            this.myContacts.set(result,newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact){
        int result = findContact(contact);
        if (result >= 0){
            this.myContacts.remove(contact);
            return true;
        }
        return false;
    }
}
