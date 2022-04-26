package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        byte
//        short
//        int
//        long
//        float
//        double
//        char
//        boolean

        String mojeString = "To jest String";
        System.out.println("Moje string jest równe " + mojeString);
        mojeString = mojeString + ", \u00A9";
        System.out.println("Moje string jest równe " + mojeString);

        String numerStringow = "250.55";
        numerStringow = numerStringow + "40.99";
        System.out.println(numerStringow);

        String ostatniString = "10";
        int mojeInt = 50;
        ostatniString = ostatniString + mojeInt;/*Java przekonwertowało automatycznie dane INT na STRING*/
        System.out.println("Ostatni string wynosi: " + ostatniString);/*wynik tego jest w formacie STRING*/
    }
}
