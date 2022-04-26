public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long minutesBefore = minutes;

            long hour = minutes / 60;
            minutes %= 60;

            long day = hour / 24;
            hour %= 24;

            long year = day / 365;
            day %= 365;
            System.out.println(minutesBefore + " min = " + year + " y and " + day + " d");
        }
    }
}