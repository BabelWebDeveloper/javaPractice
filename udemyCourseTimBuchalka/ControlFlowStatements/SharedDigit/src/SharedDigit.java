public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        if (10 <= number1 && number1 <= 99 && 10 <= number2 && number2 <= 99) {
            int front1 = 0;
            int front2 = 0;
            int back1 = 0;
            int back2 = 0;
            while (number1 >= 10 && number2 >= 10) {

                back1 = number1 % 10;
                number1 /= 10;
                front1 = number1 /= 10;


                back2 = number2 % 10;
                number2 /= 10;
                front2 = number2 /= 10;

                System.out.println("front1: " + front1);
                System.out.println("front2: " + front2);
                System.out.println("back1: " + back1);
                System.out.println("back2: " + back2);
            }
//            return lastDigit1 == lastDigit2 || lastDigit1 == firstDigit2 || firstDigit2 == firstDigit1 || firstDigit1 == lastDigit1;
            return true;
        } else {
            return false;
        }
    }
}

//public class SharedDigit {
//    public static boolean hasSharedDigit(int number1, int number2) {
//        if (10 <= number1 && number1 <= 99 && 10 <= number2 && number2 <= 99) {
//            int lastDigit1 = number1 % 10;
//            int lastDigit2 = number2 % 10;
//            int firstDigit1 = number1;
//            int firstDigit2 = number2;
//            while (firstDigit1 >= 10) {
//                firstDigit1 /= 10;
//            }
//            while (firstDigit2 >= 10) {
//                firstDigit2 /= 10;
//            }
//            return lastDigit1 == lastDigit2 || lastDigit1 == firstDigit2 || firstDigit2 == firstDigit1 || firstDigit1 == lastDigit1;
//        } else {
//            return false;
//        }
//    }
//}