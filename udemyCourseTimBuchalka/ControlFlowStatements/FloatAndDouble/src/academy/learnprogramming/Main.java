package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    float mojaMinFloat = Float.MIN_VALUE;
        float mojaMaxFloat = Float.MAX_VALUE;
        System.out.println("Wartość minimalna Float: " + mojaMinFloat);
        System.out.println("Wartość maksymalna Float: " + mojaMaxFloat);

        double mojaMindouble = Double.MIN_VALUE;
        double mojaMaxdouble = Double.MAX_VALUE;
        System.out.println("Wartość minimalna double: " + mojaMindouble);
        System.out.println("Wartość maksymalna double: " + mojaMaxdouble);

        int mojaInt = 5 / 2;/*wyświetli całkowitą liczbę - nie ułamek*/
        float mojaFloat = 5f / 3f;/*dobrą praktyką jest dopisywanie na koniec liczb float i double odpowiadających im pierwszych liter*/
        double mojaDouble = 5d / 3f;/*możemy wykonywać działania na mieszanych liczbach*/

        System.out.println("Wartość mojaInt: " + mojaInt);
        System.out.println("Wartość mojaFloat: " + mojaFloat);/*float i double zawsze będą się wyświetlać ze znakiem za kropką nawet jeśli nie są ułamkami*/
        System.out.println("Wartość mojaDouble - bardziej precyzyjna od float: " + mojaDouble);
    }
}
//Single precision number posiada szerokość 32 bitów (32 liczby)
//Double precision zawiera 64 bity
