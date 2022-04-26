public class LargestPrime {
    public static int getLargestPrime(int number) {
        int checkRemainder;
        int largestPrime = 0;
        if (number <= 0) {
            return -1;
        }
        else {

            for (int i = 2; i <= number; i++){

                if (number % i == 0){
                    checkRemainder = i;
                    int count = 0;
                    System.out.println("This is checkrem: " + checkRemainder);

                    for (int j = checkRemainder;j >= 1; j--){
                        if (checkRemainder % j == 0){
                            count++;
                        }
                    }

                    if (count == 2){
                        largestPrime = checkRemainder;
                    }
                }

            }

            return largestPrime;

        }
    }
}
//if (number % remainder == 0 && remainder % 2 != 0)