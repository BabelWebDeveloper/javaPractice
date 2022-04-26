public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

//        access by the getters:
        thePC.getMonitor().drawPixelAt(1500, 1200, "red" );//uzyskanie dostępu do metod dzięki wcześniejszemu zadeklarowaniu  fieldsu monitor w PC oraz fieldsu drawPixelArt w monitor
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();
        System.out.println();

//        access by the method (without getters):
        thePC.powerUp();
    }
}
