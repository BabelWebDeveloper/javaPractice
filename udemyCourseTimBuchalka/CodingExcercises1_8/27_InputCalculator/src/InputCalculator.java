import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);//1. nowa instancja scanera

        int sum = 0;
        int count = 0;
        double avg = 0;

        while (true){
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int number = scanner.nextInt();//2. przypisanie wyniku scanera do zmiennej
                sum += number;
                count++;
                avg = (double) sum / (double) count;
            } else {
                System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
                scanner.close();
                break;
            }
        }
    }
}
