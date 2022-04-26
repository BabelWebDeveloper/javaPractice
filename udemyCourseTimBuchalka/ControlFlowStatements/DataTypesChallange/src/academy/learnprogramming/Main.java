package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //    PRIMITIVE TYPES CHALLANGE:
        byte wartoscByte1 = 10;
        short wartoscShort1 = 137;
        int wartosc1Int = 200;
        long wartoscLong1 = 50000L + (10 * (wartoscByte1 + wartoscShort1 + wartosc1Int));

        System.out.println(wartoscLong1);

        short wartoscShortTotal = (short) (1000 + 10 * 10);
        System.out.println(wartoscShortTotal);
    }
}
