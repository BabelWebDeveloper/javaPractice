public class areaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            return - 1.0;
        }
        double areaOfACircle = radius * radius * Math.PI;
        return areaOfACircle;
//        x * y * x * y = x * y
//        ... * (1 / 0) * (1 / 0)
    }

    public static double area(double x, double y) {
        if (0 <= x && 0 <= y) {
            double areaOfRectangle = x * y;
            return areaOfRectangle;
        }
        return -1.0;
    }
}
