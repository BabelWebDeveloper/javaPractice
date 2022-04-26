public class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    class Rectangle2 extends Shape {
        private int width;
        private int height;

        //1 st constructor:
        public Rectangle2(int x, int y) {
            this(x, y, 0, 0); //call 2nd constructor
        }

        // 2nd constructor
        public Rectangle2(int x, int y, int width, int height) {
            super(x, y); //call constructor from parent (Shape) to initialize x and y
            //doing all work:
            this.width = width;//initialize width and height
            this.height = height;
        }
    }
}
