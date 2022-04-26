import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;//declare arrayList named myContacts

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;//declare my number from parameter, never used in this app
        this.myContacts = new ArrayList<Contact>();
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);//return index from myContacts array
    }

    private int findContact(String contactName) {//return contact index based of given contact name
        for(int i=0; i<this.myContacts.size(); i++) {//loop through all contacts, size() in built function (in arrays), return size
            Contact contact = this.myContacts.get(i);//create new contact..., get() in built function (in arrays), return wanted element based on given index
            if(contact.getName().equals(contactName)) {//... to compare with passed String contactName
                return i;//return contact index
            }
        }
        return -1;
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {//calling findContact(String contactName), this class return number
            System.out.println("Contact is already on file");
            return false;
        } else {
            myContacts.add(contact);//add - function built in arrayList
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);//findContact(Contact contact) returns index of contact that was passed, if there's no such contact it returns -1
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() +", was not found.");
            return false;
        } else {
            this.myContacts.set(foundPosition, newContact);//set() is in-built (array) function that need index of a contact and new contact to will be passing
            System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());//we have access to getName() because of declaring Contact file in arrayList
            return true;
        }
    }

    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);//return contact index like above
        if(foundPosition < 0) {
            System.out.println(contact.getName() +", was not found.");
            return false;
        } else {
            this.myContacts.remove(foundPosition);//remove() in built function (in arrays)
            System.out.println(contact.getName() + " ,was deleted.");
            return true;
        }
    }

    public Contact queryContact(String name){//return contact from given contact name if it exists
        int position = findContact(name);
        if (position >= 0){
            return myContacts.get(position);
        } else {
            return null;
        }
    }

    public void printContacts(){
        System.out.println("Contact List");
        for (int i=0; i < this.myContacts.size(); i++){
            System.out.println((i+1) + "." +
                    this.myContacts.get(i).getName() + " -> " +//this.myContacts which is defined at the top, allows us to use getName(), means myContacts[i].getName()
                    this.myContacts.get(i).getPhoneNumber());//means myContacts[i].someFunction
        }
    }
}
