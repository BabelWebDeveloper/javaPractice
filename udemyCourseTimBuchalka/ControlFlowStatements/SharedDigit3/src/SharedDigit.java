public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2){
        if ((10 <= number1 && number1 <= 99) && (10 <= number2 && number2 <= 99)){
            int lastDigit1 = number1 % 10;
            int firstDigit1 = number1 /= 10;
//            while (number1 >= 10) {
//                number1 /= 10;
//                if (number1 == number2 % 10 || lastDigit1 == number2 % 10){
//                    return true;
//                }
//                while (number2 >= 10){
//                    number2 /= 10;
//                    if (number1 == number2 || lastDigit1 == number2){
//                        return true;
//                    }
//                }
//            }

            if ((firstDigit1 == number2 % 10) || (lastDigit1 == (number2 % 10))){
                return true;
            } else {
                number2 /= 10;
                if ((firstDigit1 == number2) || lastDigit1 == number2){
                    return true;
                } else {
                    return false;
                }
            }

        }
        return false;
    }
}


//  Obliczanie ostatniej liczby:
//    int lastDigit = number % 10;

//  Oblicanie pierwszej liczby:
//            while (firstDigit >= 10){
//                    firstDigit /= 10;
//            }
