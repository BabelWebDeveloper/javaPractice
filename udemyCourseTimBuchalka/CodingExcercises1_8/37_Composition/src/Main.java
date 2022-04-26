public class Main {
    public static void main(String[] args) {
        Bed bed = new Bed("Rococo",4,0.3,1,1);
        Lamp lamp = new Lamp("Rococo",true,10);
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");
        Bedroom myBedroom = new Bedroom("My bedroom",wall1,wall2,wall3,wall4,new Ceiling(2,00000),bed,lamp);
        lamp.turnOn();
        lamp.turnOn();
    }
}
