public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 0, 3, 5, 7, 0, 9, 11};
        moveToLeft(array);
    }

    private static void moveToLeft(int[] array){
        for (int i = 0, j = 0; i < array.length; i++){
            if (array[i] == 0){
                int memo = array[j];
                array[j] = array[i];
                array[i] = memo;
                j++;
            }
        }

        for (int l = 0; l < array.length; l++){
            System.out.println(array[l]);
        }
    }
}
