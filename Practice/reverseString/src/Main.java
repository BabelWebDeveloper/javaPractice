public class Main {
    public static void main(String[] args) {
        reverseString("Kinga");
    }

    private static void reverseString(String word){
        for (int i = word.length() - 1; i > -1; i--){
            System.out.print(word.charAt(i));
        }
    }
}
