import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myContacts = new MobilePhone("667-667-667");

    public static void main(String[] args) {
        // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.

        boolean quit = false;
        int choice = 0;

        printInstructions();

        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    myContacts.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Wrong choice, try again!");
                    printInstructions();
            }
        }
    }

    public static void printInstructions() {//działa
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add new contact.");
        System.out.println("\t 3 - To update contact.");
        System.out.println("\t 4 - To delete contact.");
        System.out.println("\t 5 - To find contact.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addContact(){//działa
        System.out.println("Enter name of new contact: ");
        String name = scanner.nextLine();
        System.out.println("Enter number of new contact: ");
        String phone = scanner.nextLine();
        myContacts.addNewContact(name,phone);
    }

    public static void searchContact(){//działa ale źle
        System.out.println("Enter contact for search:");
        String contact = scanner.nextLine();
        if (myContacts.findContact(contact) >= 0){
            System.out.println("Found " + contact);
        } else {
            System.out.println(contact + ", not on file.");
        }
    }

    public static void deleteContact(){//działa
        System.out.println("Enter contact for delete:");
        String contact = scanner.nextLine();
        myContacts.removeContact(contact);
    }

    public static void updateContact(){//działa
        System.out.println("Enter contact for update:");
        String oldContact = scanner.nextLine();
        if (myContacts.findContact(oldContact) < 0){
            System.out.println(oldContact + " doesn't exist.");
        } else {
            System.out.println("Enter name of updated contact:\r");
            String name = scanner.nextLine();
            System.out.println("Enter number of updated contact:");
            String number = scanner.nextLine();
            myContacts.updateContact(oldContact,name,number);
            System.out.println("Contact successfully updated.");
        }
    }
}
