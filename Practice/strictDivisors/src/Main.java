public class Main {
    public static void main(String[] args) {
        sumStrictDivisors(10);
    }

    private static void sumStrictDivisors(int number){
        int sum = 0;
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                sum += i;
            }
        }
        System.out.println("Sum equals: " + sum);
    }
}
