public class IntEqualityPrinter {
    public static void IntEqualityPrinter(int st1, int sc2, int th3){
        if (st1 < 0 || sc2 < 0 || th3 < 0) {
            System.out.println("Invalid Value");
        } else if (st1 == sc2 && sc2 == th3 && th3 == st1){
            System.out.println("All numbers are equal");
        } else if (st1 != sc2 && sc2 != th3 && th3 != st1){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
