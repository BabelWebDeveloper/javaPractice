public class Main {
    public static void main(String[] args) {
        LightingBulb lightingBulb = new LightingBulb("White", 70);
        Lighting lights = new Lighting(4, lightingBulb);

        WindowBlinds windowBlinds = new WindowBlinds("Wood");
        Windows windows = new Windows(2,1,windowBlinds);

        Door door = new Door("Steel",true);

        Room bedroom = new Room("Bedroom", new Dimensions(3,4,2.5),lights,windows,door);

//        Call methods without getters (private methods):
//        bedroom.getWindows().openCloseWindow(true);
        bedroom.close(true,false);

        System.out.println();

//        Call methods with getters:
        bedroom.getLight().lightControl(21);
        bedroom.getLight().getLightingBulb().changeLightColour("Red");

        System.out.println();

        bedroom.close(false,true);

        System.out.println();

        bedroom.getLight().lightControl(18);

        System.out.println();
    }
}
