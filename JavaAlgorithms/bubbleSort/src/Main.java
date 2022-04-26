public class Main {
    public static void main(String[] args) {
        int[] array = {5,2,6,1};
        sortArray(array);
    }

    private static void sortArray(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1; j++){
                if (array[j] < array[j+1]){
                    int memo = array[j];
                    array[j] = array[j +1];
                    array[j+1] = memo;
                }
            }
        }
        printArray(array);
    }

    private static void printArray(int[] array){
        System.out.println("Array list:");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
