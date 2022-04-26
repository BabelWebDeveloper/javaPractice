import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {4,3,7,8,1};
        System.out.println(alternativeOperations(array));
        System.out.println();
//        createArray();
    }

    public static int alternativeOperations(int[] array){
        int length = array.length;
        int sum = 0;
        int start = 0;

        if (length == 0){
            return -1;
        }

        if (length % 2 != 0){
            start = 1;
            sum += array[0];
        }

        int multiplication;

        for (int i = start; i < length; i+=2){
            multiplication = 1;
            for (int j = 0; j < 2; j++){
                multiplication *= array[j + i];
            }
            sum += multiplication;
        }

        return sum;
    }

    public static void createArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of an array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++){
            System.out.println("Enter " + i + " number:");
            array[i] = scanner.nextInt();
        }
        sortArray(array);
        printArray(array);
    }

    public static void sortArray(int[] array){
        for (int j = 0; j < array.length; j++){
            for (int i = 0; i < array.length - 1; i++){
                if (array[i] < array[i + 1]){
                    int memo = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = memo;
                }
            }
        }
    }

    public static void printArray(int[] array){
        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
