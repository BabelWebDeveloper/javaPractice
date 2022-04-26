public class Main {
    public static void main(String[] args) {
        int[] array = {10,20,30,44,22,56,32,30,20,10};
        System.out.println(checkStartEnd(array,3));
    }

    private static boolean checkStartEnd(int[] array, int n){
        for (int i = 0, j = array.length - 1; i < n; i++, j--){
            if (array[i] != array[j]){
                return false;
            }
        }
        return true;
    }
}
