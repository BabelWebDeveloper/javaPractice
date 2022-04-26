public class Main {
    public static void main(String[] args) {
        int[] array = {5,2,1,6};
        selectionSort(array);
    }

    private static void selectionSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = j + 1; i < array.length; i++) {
                if (array[j] < array[i]) {
                    int swap = array[j];
                    array[j] = array[i];
                    array[i] = swap;
                }
            }
        }
        printArray(array);
    }

    private static void printArray(int[] array){
        System.out.println("Array:");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
