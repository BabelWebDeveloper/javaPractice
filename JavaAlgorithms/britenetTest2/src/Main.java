public class Main {
    public static void main(String[] args) {
        int[] array = {1,9,2,8,3,7,4,5,6};
        printArray(evenLast(array));
        int[] array2 = {2,0,1,3};
        System.out.println();
        printArray(indexPosition(array2));
    }

    private static void printArray(int[] array){
        for (int i  = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    private static int[] evenLast(int[] array){
        int[] newArray = new int[array.length];
        for (int i = 0, k = 0, j = array.length - 1; i < array.length; i++){
            if (array[i] % 2 != 0){
                newArray[k] = array[i];
                k++;
            } else {
                newArray[j] = array[i];
                j--;
            }
        }
        return newArray;
    }

//    2,0,1,3
//    1,2,0,3
    private static int[] indexPosition(int[] array){
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            int position = array[i];
            newArray[i] = array[position];
        }
        return newArray;
    }
}
