public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

//    CONSTRUCTOR CHAINING:
    //constructor chaining allow us to avoid duplicate code which can generate many bugs, also duplicate code is a bad practise

    // 1 st constructor:
    public Rectangle() {
        this(0,0); //call 2nd constructor
    }

    // 2 nd constructor:
    public Rectangle(int width, int height) {
        this(0,0,width,height); //call 3rd constructor
    }

    //3 rd constructor:
    public Rectangle(int x, int y, int width, int height) {
        // doing all work:
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


}
