package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    double zmiennaDouble1 = 20.00d;
        double zmiennaDouble2 = 80.00d;
        double sumaDouble = (zmiennaDouble1 + zmiennaDouble2) * 100.00d;
        System.out.println((sumaDouble));

        double remainder = sumaDouble % 40.00d;
        System.out.println(remainder);

        boolean checkRemainder = (remainder == 0) ? true : false;
        System.out.println(checkRemainder);

        if (checkRemainder != true) {
            System.out.println("Got some remainder");
        }
    }
}
