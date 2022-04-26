public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start > 0 && start <= end){
            for (int i = start; i <= end; i++){
                if (isOdd(i) == true){
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
}
