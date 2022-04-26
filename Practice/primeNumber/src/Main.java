public class Main {
    public static void main(String[] args) {
        System.out.println(isPrime(15));
    }

    private static boolean isPrime(int number){
        int divisors = 0;
        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                divisors++;
            }
        }
        if (divisors == 2){
            return true;
        }
        return false;
    }
}
