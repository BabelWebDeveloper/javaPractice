public class WindowBlinds {
    private String material;

    public WindowBlinds(String material) {
        this.material = material;
    }

    public void openCloseBlinds(boolean openOrClose){
        System.out.println("WindowBlinds openCloseBlinds() called ---");
        if (openOrClose){
            System.out.println("Blinds are opened.");
        } else {
            System.out.println("Blinds are closed.");
        }
    }

    public String getMaterial() {
        return material;
    }
}
