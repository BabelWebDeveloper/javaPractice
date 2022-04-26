package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean czyJestKosimta = false;
        if (czyJestKosimta == false){
            System.out.println("To nie jest kosmita!");
            System.out.println("Boje się kosmitów!!");
        }
        System.out.println("To jest poza deklaracją - poza średnikiem. Jeśli zadeklarujemy na true dalej sięwyświetli");

        int topWynik = 80;
        int drugiTopWynik = 60;
        if ((topWynik > drugiTopWynik) && (topWynik < 100)) {
            System.out.println("Zdobyłeś najwyższy wynik i mnijeszy niż 100!");
        }

        if ((topWynik > 90) || (drugiTopWynik <= 90)){
            System.out.println("Żadne lub oba warunki są prawdziwe");
        }

        int nowaWartosc = 51;
        if (nowaWartosc != 50) {
            System.out.println("Wartość się nie zgadza");
        }

        boolean isCar = true;
        boolean wasCar = isCar ? true : false;/*potrójny operator: jeśli isCar == true wtedy wasCar = true, jeśli isCar == false wtedy wasCar = false*/
        if (wasCar) {
            System.out.println("wasCar is true");
        }

    }
}
//deklaracja if-then mówi programowi żeby wykonywał dany kod wtedy gdy zadany test ma wartość prawdziwą (true)
