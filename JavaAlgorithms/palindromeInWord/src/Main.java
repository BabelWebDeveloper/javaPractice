import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(palindromeInWord("Kayak"));
    }

    private static boolean palindromeInWord(String word){
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--){
            reversedWord += word.charAt(i);
        }
        word = word.toLowerCase(Locale.ROOT);
        reversedWord = reversedWord.toLowerCase(Locale.ROOT);
        if (reversedWord.equals(word)){
            return true;
        }
        return false;
    }
}
