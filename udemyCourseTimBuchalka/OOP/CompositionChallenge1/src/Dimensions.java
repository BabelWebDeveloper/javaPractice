public class Dimensions {
    private double width;
    private double length;
    private double height;

    public Dimensions(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void areaOfWalls(){
        System.out.println("The walls of room have area of " + (width * length) + " m^2.");
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }
}
