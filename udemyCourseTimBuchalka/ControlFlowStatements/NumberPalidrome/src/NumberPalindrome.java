public class NumberPalindrome {
    public static boolean isPalidrome(int number){
        int reverse = 0;
        int beginNumber = number;
        while (number != 0) {
            reverse += number % 10;
            reverse *= 10;
            number /= 10;
        }
        int divide = reverse / 10;
        if (beginNumber == divide) {
            return true;
        } else {
            return false;
        }
    }
}