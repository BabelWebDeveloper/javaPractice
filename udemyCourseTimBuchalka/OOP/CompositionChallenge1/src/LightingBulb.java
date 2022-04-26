public class LightingBulb {
    private String color;
    private int voltage;

    public LightingBulb(String color, int voltage) {
        this.color = color;
        this.voltage = voltage;
    }

    public void changeLightColour(String newColor){
        System.out.println("LightingBulb changeLightColour called ---");
        System.out.println("Color of light was changed to " + newColor);
    }

    public String getColor() {
        return color;
    }

    public int getVoltage() {
        return voltage;
    }
}
