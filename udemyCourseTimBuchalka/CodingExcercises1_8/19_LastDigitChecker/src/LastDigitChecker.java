public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if (num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000 ||num3 < 10 || num3 > 1000){
            return false;
        } else {
            int last1 = num1 % 10;
            int last2 = num2 % 10;
            int last3 = num3 % 10;

            if (last1 == last2 || last2 == last3 || last3 == last1){
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean isValid(int num1){
        if (num1 >= 10 && num1 <= 1000){
            return true;
        } else {
            return false;
        }
    }
}
