package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//	    System.out.println(isPrime(31));
        int count = 0;
        for (int j = 10; j <= 30; j++){
            if (isPrime(j)){
                count++;
                System.out.println("Number " + j + " is prime.");
                if (count == 3){
                    System.out.println("Exiting from loop - reached 3 numbers.");
                    break;
                }
            } else {
                count += 0;
            }
        }
    }

    public static boolean isPrime(int n){
         if (n == 1) {
             return false;
         }
//        for (int i=2; i <= n/2; i++){ dla poprawienia optymalizacji kodu - w tym przypadku więcej razy by sprawdzało
         for (int i=2; i <= (long) Math.sqrt(n); i++){
             System.out.println("Looping " + i);
             if (n % i == 0) {
                 return false;
             }
         }
         return true;

    }
}
