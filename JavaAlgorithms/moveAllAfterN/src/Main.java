public class Main {
    public static void main(String[] args) {
//        Write a C program to create a new array taking the elements after the element value 5 from a given array of integers. Go to the editor
//          Expected Output:
//
//          Elements in original array are: 1, 2, 3, 5, 7, 9, 11
//          Elements in new array are: 7, 9, 11
        int [] array = {1, 2, 3, 5, 7, 9, 11};
        int n = 5;
        printArray(moveAfterN(array,n));
//        moveAfterN(array,n);
        ;
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    private static int[] moveAfterN(int [] array, int n){
        int [] newArray = {};
        for (int i = 0; i < array.length; i++){
            if (array[i] == n){
                newArray = new int[array.length - i - 1];
                for (int j = 0, k = i; j < newArray.length; j++, k++){
                    newArray[j] = array[k];
                }
            }
        }
        return newArray;
    }
}
