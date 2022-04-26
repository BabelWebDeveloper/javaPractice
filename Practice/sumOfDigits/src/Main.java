public class Main {
    public static void main(String[] args) {
        sumDigits(1123);
    }

    private static void sumDigits(int number){
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}
