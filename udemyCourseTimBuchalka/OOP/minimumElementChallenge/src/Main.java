import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int [] myArray1;
        myArray1 = readIntegers(count);
        System.out.println(findMin(myArray1));

    }

    private static int[] readIntegers(int count){
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[count];
        System.out.println("Enter " + count + " numbers.");

        for (int i = 0; i < array.length; i++){
            System.out.println("Enter " + i + " number:");
            boolean isInt = scanner.hasNextInt();
            if (isInt){
                int number = scanner.nextInt();
                scanner.nextLine();
                array[i] = number;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }

    private static int findMin(int [] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

}
