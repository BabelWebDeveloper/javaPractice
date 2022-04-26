public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int initialNumber = number;
        int palindrome = 0;
        while (number != 0){
            palindrome += number % 10;
            palindrome *= 10;
            number /= 10;
        }
        palindrome /= 10;
        if (palindrome == initialNumber){
            return true;
        } else {
            return false;
        }
    }
}
