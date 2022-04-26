public class Lighting {
    private int numberOfLamps;
    private LightingBulb lightingBulb;

    public Lighting(int numberOfLamps, LightingBulb lightingBulb) {
        this.numberOfLamps = numberOfLamps;
        this.lightingBulb = lightingBulb;
    }

    public void lightControl(int hour){
        System.out.println("Lighting lightControl() called ---");
        if (hour > 23 || hour < 0){
            System.out.println("Error with a clock - wrong hour!");
        } else {
            if (hour > 20 || hour < 5){
                System.out.println("Lights are turned on.");
            } else {
                System.out.println("Light are turned off.");
            }
        }
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public LightingBulb getLightingBulb() {
        System.out.println("LightingBulb getLightingBulb() called ---");
        return lightingBulb;
    }
}
