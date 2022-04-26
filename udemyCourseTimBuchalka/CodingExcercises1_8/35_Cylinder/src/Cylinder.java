public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {//konstruktor tylko...
        super(radius);
        if (height < 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea() * height;
    }//superklasa nie ma do tego dostępu
}
