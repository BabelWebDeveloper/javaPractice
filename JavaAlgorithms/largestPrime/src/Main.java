public class Main {
    public static void main(String[] args) {
        System.out.println(largestPrime(7));
    }

    private static int largestPrime(int n){
        for (int d = n; d > 0; d--){
            if (d != n && n % d == 0){
                return d;
            }
        }
        return n;
    }
}
