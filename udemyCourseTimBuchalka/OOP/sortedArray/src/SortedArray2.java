import java.util.Arrays;
import java.util.Scanner;

public class SortedArray2 {

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] getIntegers(int length){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter " + (i + 1) + " value.");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int [] array){
        int [] sorted = Arrays.copyOf(array,array.length);
        int memo;

        for (int j = 0; j < sorted.length; j++){
            for (int i = 0; i < sorted.length - 1; i++){
                if (sorted[i] < sorted[i + 1]){
                    memo = sorted[i];
                    sorted[i] = sorted[i + 1];
                    sorted[i + 1] = memo;
                }
            }
        }

        return sorted;
    }

}
