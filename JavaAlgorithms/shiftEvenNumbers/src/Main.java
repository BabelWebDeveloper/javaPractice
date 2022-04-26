public class Main {
    public static void main(String[] args) {
//        Write a C program to create new array from a given array of integers shifting all even numbers before all odd numbers.
//        Elements in new array are: 2, 4, 6, 3, 5, 1, 5, 9, 11
        int[] array = {1, 2, 5, 3, 5, 4, 6, 9, 11};
        printArray(shiftEven(array));
//        shiftEven(array);
    }

    private static int[] shiftEven(int[] array){
        int[] sorted = new int[array.length];
        for (int i = 0, j = array.length - 1, k = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                sorted[k] = array[i];
                k++;
            } else {
                sorted[j] = array[i];
                j--;
            }
        }
        array = sorted;
        return array;
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
