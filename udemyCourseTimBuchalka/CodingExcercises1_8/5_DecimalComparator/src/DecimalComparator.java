public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        num1 *= 1000;
        num2 *= 1000;

        num1 = (long) num1;
        num2 = (long) num2;
        if (num1 == num2) {
            return true;
        } else {
            return false;
        }
    }
}
