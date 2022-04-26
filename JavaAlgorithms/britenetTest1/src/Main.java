public class Main {
    public static void main(String[] args) {
        int[] array = {4,3,7,8,1};
        System.out.println(alternativeOperations(array));
//        alternativeOperations(array);
        int[] array2 = {5,2,6,1};
        printArray(sortArray(array2));
    }

    private static int alternativeOperations(int[] array){
        int start = 0;
        int sum = 0;
        int multiply = 1;
        int length = array.length;

        if (length % 2 != 0){
            sum += array[0];
            start = 1;
        }

        for (int i = start; i < length; i += 2){
            multiply = 1;
            for (int j = 0; j < 2; j ++){
                multiply *= array[j+i];
            }
            sum += multiply;
        }
        return sum;
    }

    private static int[] sortArray(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - 1; j++){
                if (array[j] < array[j+1]){
                    int memo = array[j];
                    array[j] = array[j+1];
                    array[j+1] = memo;
                }
            }
        }
        return array;
    }

    private static void printArray(int[] array){
        for (int i  = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
