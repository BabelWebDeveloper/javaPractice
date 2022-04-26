public class Main {
    public static void main(String[] args) {
        long miles = speedConverter.toMilesPerHour(10.5);
        System.out.println("miles = " + miles);

        speedConverter.printConversion(10.5);
    }
}
