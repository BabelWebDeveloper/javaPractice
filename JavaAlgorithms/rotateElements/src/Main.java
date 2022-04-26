public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        rotateElements(array);
    }

    private static void rotateElements(int[] array){
        for (int i = 0; i < array.length - 1; i += 2){
            int memo = array[i];
            array[i] = array[i+1];
            array[i+1] = memo;
        }
        printArray(array);
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
