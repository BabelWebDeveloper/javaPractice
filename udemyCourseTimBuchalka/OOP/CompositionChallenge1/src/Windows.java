public class Windows {
    private double width;
    private double height;
    private WindowBlinds windowBlinds;

    public Windows(double width, double height, WindowBlinds windowBlinds) {
        this.width = width;
        this.height = height;
        this.windowBlinds = windowBlinds;
    }

    public void openCloseWindow(boolean openOrClose){
        System.out.println("Window openCloseWindow() called ---");
        if (openOrClose){
            System.out.println("Windows are opened.");
        } else {
            System.out.println("Windows are closed.");
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public WindowBlinds getWindowBlinds() {
        return windowBlinds;
    }
}
