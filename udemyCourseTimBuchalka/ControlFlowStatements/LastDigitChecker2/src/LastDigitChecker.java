public class LastDigitChecker {
    public static boolean isValid(int number){
        if (number >= 10 && number <= 1000){
            return true;
        } else {
            return false;
        }
    }

    public static boolean LastDigitChecker(int num1, int num2, int num3){
        if (isValid(num1) == true && isValid(num2) == true && isValid(num3) == true){

            int lastDigi1 = num1 %= 10;
            int lastDigi2 = num2 %= 10;
            int lastDigi3 = num3 %= 10;

            if (lastDigi1 == lastDigi2 || lastDigi2 == lastDigi3 || lastDigi3 == lastDigi1){
                return true;
            }
        }
        return false;
    }
}
