import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);//deklaracja skanera

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);

        for(int i=0; i<myIntegers.length; i++) {
            System.out.println(myIntegers[i]);
        }
//        System.out.println("The average is " + getAverage(myIntegers));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];//deklaracja długości szyku

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();//przypisanie ze skanera
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i=0; i< array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double)array.length;

    }
}
