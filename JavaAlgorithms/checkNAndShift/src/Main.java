public class Main {
    public static void main(String[] args) {
//        Write a C program to create a new array after replacing  all the values 5 with 0 shifting all zeros to right direction.
//        Elements in original array are: 1, 2, 0, 3, 5, 7, 0, 9, 11, 5
//        Elements in new array are:      1, 2, 0, 3, 7, 0, 9, 11, 0, 0
        int[] array = {1, 2, 0, 3, 5, 7, 0, 9, 11, 5};
        int n = 5;
//        checkShift(array,n);
        printArray(checkShift(array,n));
    }

    private static int[] checkShift(int[] array, int n){
        for (int j = 0, k = array.length - 1; j < array.length; j++){
            if (array[j] == n){
                for (int i = j; i < array.length - 1; i++){
                    array[i] = array[i+1];
                }
                array[k] = 0;
                k--;
            } else {
                array[j] = array[j];
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
