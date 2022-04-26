public class Point {
    private int x;
    private int y;

    public Point(){
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(){
        return Math.sqrt((0 - x) * (0 - x) + (0 - y) * (0 - y));
    }

    public double distance(int x, int y){
        return Math.sqrt((getX() - x) * (getX() - x) + (getY() - y) * (getY() - y));
//        samo "x" pobiera wartość z main
//        getX() to wartość z zadeklarowanego obiektu - first
    }

    public double distance(Point point){
        return Math.sqrt((point.getX() - x) * (point.getX() - x) + (point.getY() - y) * (point.getY() - y));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
