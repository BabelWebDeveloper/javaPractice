import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double avg = 0;

        while (true) {

            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
                avg = Math.round((double) sum / (double) count);
            }
            else {
                System.out.println("SUM = " + sum + " AVG = " + (int) avg);
                break;
            }

        }
    }
}
