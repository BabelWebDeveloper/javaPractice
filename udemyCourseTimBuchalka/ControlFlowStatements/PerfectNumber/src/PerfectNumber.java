public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        } else {
            int remainder = 1;
            int sumOfFactors = 0;

            for (; remainder < number; remainder++) {

                if (number % remainder == 0) {
                    sumOfFactors += remainder;
//                    System.out.println("Numer: " + number);
//                    System.out.println("Dzielnik: " + remainder);
//                    System.out.println("Suma remainderow: " + sumOfFactors);
//                    System.out.println(" ");
                }
            }
            if (number == sumOfFactors){
                return true;
            } else {
                return false;
            }
        }
    }
}

//    int remainder = 1;
//    int sumOfFactors = 0;
//        if (number < 1) {
//        System.out.println("Invalid Value");
//        }
//        else {
//
//        for (;remainder <= number; remainder++){
//
//        if (number % remainder == 0){
//        sumOfFactors += remainder;
//        System.out.println(remainder);
//        System.out.println(sumOfFactors);
//        }
//        }
//
//        }


//if (number % 2 != 0){
//        return false;
//        }
//        else {
//        while (number >= 2){
//        number /= 2;
//        if (number == 2){
//        number -= 2;
//        break;
//        }
//        }
//        }
//        return true;
