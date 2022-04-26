public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;
    private boolean isOn;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
        this.isOn = false;
    }

    public void turnOn(){
        if (!isOn){
            System.out.println("Lamp -> Turning on");
            this.isOn = true;
        } else {
            System.out.println("Lamp -> Turning off");
            this.isOn = false;
        }
    }

    public boolean isBattery(){
        return battery;
    }

    public String getStyle() {
        return style;
    }

    public int getGlobRating() {
        return globRating;
    }
}
