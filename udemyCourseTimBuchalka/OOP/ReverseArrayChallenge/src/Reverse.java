public class Reverse{
    private static void reverseArray(int[] array){
        int memo;
        for (int i = 0; i < array.length; i++){
            memo = array[0 + i];
            array[0 + i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = memo;
        }
    }
}
