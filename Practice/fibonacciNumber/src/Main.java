public class Main {
    public static void main(String[] args) {
        fibo(8);
    }
    private static void fibo(long number){
        long fiboNumber = 0;
        if (number == 1 || number == 2){
            fiboNumber = 1;
        } else {
            for (long count = 2, i = 1, j = 1; count < number; count++){
                fiboNumber = i + j;
                i = j;
                j = fiboNumber;
            }
        }
        System.out.println(fiboNumber);
    }
}
