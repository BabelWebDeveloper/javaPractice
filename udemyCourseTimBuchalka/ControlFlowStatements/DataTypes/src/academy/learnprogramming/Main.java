package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        DATA TYPES INTRO START HERE:
//        INT: ma szerokość 32 bity
        int mojaWartosc = 10000;

        int mojeMinWartosc = Integer.MIN_VALUE;
        int mojeMaxWartosc = Integer.MAX_VALUE;

        System.out.println("Wartość minimalna = " + mojeMinWartosc);
        System.out.println("Wartość maksymalna = " + mojeMaxWartosc);

        System.out.println("Wartość maksymalna CRASH= " + (mojeMaxWartosc + 1));/*uzyskaliśmy minimalną wartość - nie może być niższa, nastąpiło zjawisko */

//        BYTE: ma szerokość 8 bitów
        byte mojaMinWartoscByte = Byte.MIN_VALUE;
        byte mojaMaxWartoscByte = Byte.MAX_VALUE;
        System.out.println("Wartość minimalna pamięci Byte = " + mojaMinWartoscByte);
        System.out.println("Wartość maksymalna pamięci Byte = " + mojaMaxWartoscByte);


//        SHORT: ma szerokość 16 bitów
        short mojaMinWartoscShort = Short.MIN_VALUE;
        short mojaMaxWartoscShort = Short.MAX_VALUE;
        System.out.println("Wartość minimalna pamięci Short = " + mojaMinWartoscShort);
        System.out.println("Wartość maksymalna pamięci Short = " + mojaMaxWartoscShort);

//        LONG: ma szerokość 64 bity
        long mojaWartoscLong = 100L;/*dodanie na końcu liczby L wymusza na Javie aby ta uważała tą watość za LONG*/
        long mojaMinWartoscLong = Long.MIN_VALUE;
        long mojaMaxWartoscLong = Long.MAX_VALUE;
        System.out.println("Wartość minimalna pamięci Long = " + mojaMinWartoscLong);
        System.out.println("Wartość maksymalna pamięci Long = " + mojaMaxWartoscLong);
//        DATA TYPES INTRO END HERE.

//        CASTING:
        int mojaWartoscTotal = (mojeMinWartosc / 2);

        byte mojaNowaWartoscByte = (byte) (mojaMinWartoscByte / 2);/*Casting - wymuszenie na Javie aby*/

        short mojaNowaWartoscShoer = (short) (mojaMinWartoscShort / 2);
    }
}
/*Integer - Wrapper Class - klasa pakująca, umożliwia wkonywanie operacji na danej, użycie tej klasy w tym przypadku powie nam minimalny oraz poniżej maksymalny zakres liczb jaki może być przechowywany*/
