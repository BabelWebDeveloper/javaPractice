public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 0, 3, 5, 7, 0, 9, 11 };
        printArray(shiftAllZeros(array));
//        shiftAllZeros(array);
//        Elements in original array are: 1, 2, 0, 3, 5, 7, 0, 9, 11
//        Elements in new array are: 0, 0, 1, 3, 5, 7, 2, 9, 11
    }

    private static int[] shiftAllZeros(int[] array){
        for (int i = 0, k = 0; i < array.length; i++){
            if (array[i] == 0){
                for (int j = i; j > 0; j--){
                    array[j] = array[j - 1];
                }
                array[k] = 0;
                k++;
            }
        }
        return array;
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
