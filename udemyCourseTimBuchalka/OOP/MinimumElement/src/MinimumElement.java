import java.util.Scanner;

public class MinimumElement {

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.close();

        return count;
    }

    private static int[] readElements(int count){
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[count];
        System.out.println("Enter " + count + " number(s).");
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter " + i + " number:");
            array[i] = scanner.nextInt();
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
