public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double first, double seccond) {
        double first2 = first * 1000;
        double seccond2 = seccond * 1000;
//        System.out.println(first2);
//        System.out.println(seccond2);

        int firstInt = (int) first2;
        int seccondInt = (int) seccond2;
//        System.out.println(firstInt);
//        System.out.println(seccondInt);

        if (firstInt == seccondInt) {
            return true;
        } return false;
    }
}
