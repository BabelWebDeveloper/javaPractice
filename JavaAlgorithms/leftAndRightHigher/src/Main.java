public class Main {
    public static void main(String[] args) {
//        Input:  {1, 2, 3, 4, 5, 6, 7}
//        every second element is higher than left and right element
//        Output: {1, 3, 2, 5, 4, 7, 6}
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        printArray(rearrange(array));
    }

    private static int[] rearrange(int[] array){
        for (int i = 1; i < array.length; i+=2){
            if (array[i - 1] > array[i]){
                int memo = array[i];
                array[i] = array[i - 1];
                array[i - 1] = memo;
            } else if (array[i + 1] > array[i]){
                int memo = array[i];
                array[i] = array[i + 1];
                array[i + 1] = memo;
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
