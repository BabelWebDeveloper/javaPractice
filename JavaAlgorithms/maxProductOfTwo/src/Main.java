public class Main {
    public static void main(String[] args) {
        int [] array = {-10,-3,5,6,-2};
        takeMaxProduct(array);
    }

    private static void takeMaxProduct(int[] array){
        int max1 = array[0];
        int max2 = array[1];
        int begin = max1 * max2;

        for (int i = 2; i < array.length-1; i+=2){
            int product = array[i] * array[i+1];
            if (product > begin){
                begin = product;
                max1 = array[i];
                max2 = array[i+1];
            }
        }
        System.out.println(begin);
        System.out.println(max1);
        System.out.println(max2);
    }
}
