import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int length){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter " + (i + 1) + " value.");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int [] array){
        int [] sorted = Arrays.copyOf(array,array.length);

        boolean flag = true;
        int memo;

        while (flag){
            flag = false;//here is breakpoint
            for (int i = 0; i < sorted.length - 1; i++){//checking loop
                if (sorted[i] < sorted[i + 1]){//if (something) - flag set to true and again checking
                    memo = sorted[i];
                    sorted[i] = sorted[i + 1];
                    sorted[i + 1] = memo;
                    flag = true;
                }
            }
        }

        return sorted;
    }
}
