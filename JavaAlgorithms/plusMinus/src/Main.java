public class Main {
    public static void main(String[] args) {
        int [] array = {-4, 3, -9, 0, 4, 1};
        quantityOfNumbers(array);
    }

    private static void quantityOfNumbers(int[] array){
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > 0){
                positive++;
            } else if (array[i] < 0){
                negative++;
            } else {
                zeros++;
            }
        }
        double positiveQuantity = (double) positive / array.length;
        double negativeQuantity = (double) negative / array.length;
        double zerosQuantity = (double) zeros / array.length;

        System.out.println(Math.round(positiveQuantity * 1000000d) / 1000000d);
        System.out.println(Math.round(negativeQuantity * 1000000d) / 1000000d);
        System.out.println(Math.round(zerosQuantity * 1000000d) / 1000000d);
    }
}
