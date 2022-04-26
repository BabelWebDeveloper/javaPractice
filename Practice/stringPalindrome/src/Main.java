import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Kajak"));
        ;
    }

    private static boolean isPalindrome(String word){
        String oldWord = word.toLowerCase(Locale.ROOT);
        String newWord="";
        for (int n = word.length() - 1; n > -1 ; n--){
            newWord = newWord + word.charAt(n);
        }
        if (oldWord.equals(newWord.toLowerCase(Locale.ROOT))){

            return true;
        }
        return false;
    }
}
