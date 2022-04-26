import java.util.ArrayList;

public class MobilePhone {
    private String myPhone;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myPhone) {
        this.myPhone = myPhone;
        this.myContacts = new ArrayList<Contact>();//this give access to getters in contact
    }

//    Overload #1:
    private int findContact(Contact contact){//to receive contact record
        return this.myContacts.indexOf(contact);//return an integer that showing position is in the array for that particular contact object - return number less than 0 if object doesn't exist - needed in next methods that need to have a Contact form - not name or number
    }

//    Overload #2:
    public int findContact(String contactName){//loop through all records and compare with the name that's been passed and return the index position if it is on file
        for (int i = 0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);//creating new contact object to receive index of every object in the arrayList
            if (contact.getName().equals(contactName)){//receive contact name from every object in the arrayList and compare it to passed contactName
                return i;//return index if the test was pass
            }
        }
        return -1;//if not equal return negative
    }

    private boolean addNewContact(Contact contact){//contact has been created outside this method
        if (findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        } else {
            myContacts.add(contact);
            return true;
        }
    }

    public void addNewContact(String name, String number){//contact has been created outside this method
        Contact newContact = Contact.createContact(name,number);
        addNewContact(newContact);
    }

    private boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0){
            System.out.println(oldContact.getName() + " ,was not found.");
            return false;
        } else {
            this.myContacts.set(foundPosition,newContact);
            System.out.println(oldContact.getName() + " , was replaced with " + newContact.getName());
            return true;
        }
    }

    public void updateContact(String oldContact, String newContactName, String newContactNumber){
        int oldContactInt = findContact(oldContact);
        Contact old = myContacts.get(oldContactInt);
        Contact newContact = new Contact(newContactName,newContactNumber);
        updateContact(old,newContact);
    }

    private boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if (foundPosition < 0){
            System.out.println(contact.getName() + " ,was not found.");
            return false;
        } else {
            this.myContacts.remove(contact);
            System.out.println(contact.getName() + " , was removed.");
            return true;
        }
    }

    public void removeContact(String name){
        int contact = findContact(name);
        Contact deletedContact = myContacts.get(contact);
        removeContact(deletedContact);
    }

    public void printContactList(){
        System.out.println("You have " + myContacts.size() + " contacts in your list;");
        for (int i = 0; i < myContacts.size(); i++){
            System.out.println((i+1) + ". " + myContacts.get(i));
        }
    }
}
