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
//        placesToVisit.add("Sydney");//&
//        placesToVisit.add("Melbourne");//*
//        placesToVisit.add("Brisbane");//*
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");//*
//        placesToVisit.add("Adelaide");//*
//        placesToVisit.add("Darwin");//&
//
//        printList(placesToVisit);
//
//        placesToVisit.add(1,"Alice Springs");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("________________________________");
    }

    private static boolean addInOrder(LinkedList<String> linkedList,String city){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(city);
            if (comparison == 0){
//                equal, do not add
                System.out.println(city + " is already included as a destination");
                return false;
            } else if (comparison > 0){
//                comparison > 0 - new city should appear before this one
//                looking for Brisbane -> Adelaide as a parameter
                stringListIterator.previous();//we have to move previous because comparison move iteration to next, we have to pass Adelaide before Brisbane
                stringListIterator.add(city);
                return true;
            } else if (comparison < 0){
//                move on next city
            }
        }
        stringListIterator.add(city);//adding to the end of list
        return true;
    }

    private static void visit(LinkedList<String> cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()){
            System.out.println("No cities in the itinerary");
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
                    System.out.println("Holiday over");
                    quit = true;
                    break;

                case 1:
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                    }
                    break;

                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n +" +
                "2 - go to previous city\n +" +
                "3 - print menu options");
    }
}
