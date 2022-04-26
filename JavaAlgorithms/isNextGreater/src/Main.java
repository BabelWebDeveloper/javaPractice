public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(isGreaterOrEqual(array));

    }

    private static boolean isGreaterOrEqual(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            int check = array[i];
            if (check > array[i+1]){
                return false;
            }
        }
        return true;
    }
}
