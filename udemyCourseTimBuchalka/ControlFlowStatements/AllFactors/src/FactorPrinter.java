public class FactorPrinter {
    public static void printFactors(int number) {
        int remainder = 1;
        int sumOfFactors = 0;
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        else {

            for (;remainder <= number; remainder++){

                if (number % remainder == 0){
                    sumOfFactors += remainder;
                    System.out.println(remainder);
//                    System.out.println(sumOfFactors);
                }
            }

        }
    }
}
