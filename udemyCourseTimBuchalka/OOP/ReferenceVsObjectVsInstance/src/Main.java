public class Main {
    public static void main(String[] args) {
        House blueHouse = new House("blue");//wywołanie "planu domu"  w kolorze niebieskim, nazwa blueHouse jest jednocześnie referencją (adresem) nowego domu


        House anotherHouse = blueHouse; //stworzenie kolejnej referencji (kolejnego adresu)

        System.out.println(blueHouse.getColor());//wysłanie pierwszego zaproszenia do domu
        System.out.println(anotherHouse.getColor());//wysłanie drugiego zaproszenia do domu

        System.out.println();

        anotherHouse.setColor("yellow");//referencja odnosi się do tego samego domu (obiektu), więc wywołanie blueHouse.getColor() również zwróci wartość yellow
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());

        System.out.println();

        House greenHouse = new House("green"); //stworzenie nowego obiektu
        anotherHouse = greenHouse; //dereferencing zmiana adresu na inny
        System.out.println(blueHouse.getColor());//zwróci kolor yellow
        System.out.println(greenHouse.getColor());//zwróci kolor green
        System.out.println(anotherHouse.getColor());//zwróci kolor green - dereferencja

    }
}
