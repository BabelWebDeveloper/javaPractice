public class Main {
    public static void main(String[] args) {
//        Room room = new Room();
//        room.setCommand(new OpenCloseCurtainsCommand(room.getCurtains()));
//        room.executeCommand();
//        System.out.println(room.curtainsOpen());

//        FloorLamp lamp = new FloorLamp();
//        lamp.setCommand(new SwitchLightsCommand(lamp.getLight()));
//        lamp.executeCommand();
//        System.out.println(lamp.isLightOn());

        Kitchen kitchen = new Kitchen();//stworznie nowej instancji "Kuchnia"
        System.out.println(kitchen.curtainsOpen());//sprawdzenie czy kurtyny są otwarte
        kitchen.setCommand(new OpenCloseCurtainsCommand(kitchen.getCurtains()));//ustawienie nowej komendy "otwórz kurtyny" - dziedziczone z klasy abstrakcyjnej "Component", dzięki implementacji interfesju "Command" klasa zwraca obiekt Command
        kitchen.executeCommand();//wywołanie komendy do wykonania - dziedziczone z klasy abstrakcyjnej "Component"
        System.out.println(kitchen.curtainsOpen());//sprawdzenie czy kurtyny są otwarte
    }
}
