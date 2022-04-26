public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = 0;
            long days = 0;

            years = minutes / (365 * 24 * 60);
            days = (minutes % (365 * 24 * 60)) / 1440;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");

        }
    }
}
