public class TeenNumberChecker {
    public static boolean hasTeen(int first, int seccond, int third) {
        if ((13 <= first && first <= 19) ||
                (13 <= seccond && seccond <= 19) ||
                    (13 <= third && third <= 19)) {
            return true;
        } return false;
    }

    public static boolean isTeen(int parameter) {
        if (13 <= parameter && parameter <= 19){
            return true;
        } return false;
    }
}
