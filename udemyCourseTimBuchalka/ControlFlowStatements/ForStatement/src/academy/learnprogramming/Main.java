package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        Without FOR:
        System.out.println("10 000 at 2 % interest = " + calculateInterest(10000.0,2.0));
        System.out.println("10 000 at 3 % interest = " + calculateInterest(10000.0,3.0));
        System.out.println("10 000 at 4 % interest = " + calculateInterest(10000.0,4.0));
        System.out.println("10 000 at 5 % interest = " + calculateInterest(10000.0,5.0));
        System.out.println(" ");
//        With FOR:
        for (int i = 2; i < 9; i++) {
            System.out.println("10 000 at " + i + " % interest = " + String.format("%.2f",calculateInterest(10000.0,i)));
        }

        System.out.println(" ");

        //    FOR but REVERSE
        for (int i = 9; i > 1; i--) {
            System.out.println("10 000 at " + i + " % interest = " + String.format("%.2f",calculateInterest(10000.0,i)));
        }
    }

    public static double calculateInterest(double amount, double interest){
        return (amount * (interest / 100));
    }

}
