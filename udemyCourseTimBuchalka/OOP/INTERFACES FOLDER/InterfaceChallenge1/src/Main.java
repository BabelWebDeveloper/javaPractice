import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player tim = new Player("Tim", 10, 15);//tutaj stworzenie nowej instacji - new Player
        tim.getStrength();
        System.out.println(tim.toString());
        saveObject(tim);

        System.out.println();

        ISaveable werewolf = new Monster("Werewolf",20,40);
        System.out.println(((Monster)werewolf).getStrengh());//jeśli użyjemy interfejsu do stworzenia nowej instacji musimy o tym powiedzieć gdy uzyjemy jakiejś metody która przynależy do klasy stworzonej instacjie
        saveObject(werewolf);

//        tim.setHitPoints(8);
//        tim.setWeapon("Stormbringer");
//        System.out.println(tim);
//        saveObject(tim);
//        loadObject(tim);
//        System.out.println(tim);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){//wprowadzenie parametru jako obiekt interfejsu - czyli klasa która zaimplementowała interfejs
        for (int i = 0; i < objectToSave.write().size(); i++){//przywołanie metody write utworzonej w interfejsie - tutaj jest tak jakby wywołanie metody tim.write() (jeśli Player tim = new Player), .wrtie() zwraca listę, po dodaniu .write.get(i) zwraca wybrany element listy, czyli cały zapis ma miejsce przy pierwszym wywołaniu .write(), poniżej jest to tylko wyświetlane - ewentualnie poniższy kod mógłby przypisać tą listę do innej listy
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();//readValues() zwraca listę values
        objectToLoad.read(values);//tim.read(values) przypisuje elementy z utworzonej listy do fieldsów w Playerze
    }
}
