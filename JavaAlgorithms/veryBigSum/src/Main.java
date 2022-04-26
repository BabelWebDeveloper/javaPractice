public class Main {
    public static void main(String[] args) {
        long[] array = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        aVeryBigSum(array);
    }

    private static void aVeryBigSum(long[] array){
        long sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println(sum);
    }
}
