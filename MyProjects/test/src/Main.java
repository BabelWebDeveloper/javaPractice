import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double salary = 1000;
        System.out.println(String.format("%f",salary));
    }
}
