import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Darwin");
//        printList(placesToVisit);

        addInOrder(placesToVisit,"Alice Springs");
        addInOrder(placesToVisit,"Darwin");
//        printList(placesToVisit);

        visit(placesToVisit);
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);// returned 0 means that city is actually present in linked list
            if (comparison == 0){
//                equal, do not add
                System.out.println(newCity + " is already included.");
                return false;
            } else if (comparison > 0){
//                new city should appear before this one
//                f.e. first in linked list is Brisbane, but we pass Adelaide as a parameter, so we have to go back before Brisbane and pass there Adelaide
                stringListIterator.previous();//back to previous element
                stringListIterator.add(newCity);
                return true;
            } else {//new city must be after this one - move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();//similar to for loop used in array lists, iteration through all linked list
        while (i.hasNext()){//checking if actual element is pointing to something else
            System.out.println("Now visiting " + i.next());//reference to an iterator above, changes value of an iterator, something like i++
        }
        System.out.println();
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()){
            System.out.println("No cities.");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){

                case 0:
                    System.out.println("Holiday over.");
                    quit = true;
                    break;

                case 1:
                    if (!goingForward){//if it is false means we used to going previous
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;//going next, so going forward is true
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting: " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;//we can't go forward - end of the list
                    }
                    break;

                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;//choosing previous city so we are not going forward
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting: " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;//only direction we can go is forward
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}
