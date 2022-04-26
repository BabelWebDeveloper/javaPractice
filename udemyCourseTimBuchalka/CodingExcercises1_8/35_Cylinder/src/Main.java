public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println(circle.getVolume()); - nie ma accessa


//        można zrobić osobne metody do pobierania składników (base - 4, healty - 6, deluxe 4 + 2 zadeklarowane) ale wspólną do zliczania kosztów (override w superklasie na 6 parametrów)


//        musi być moetoda validująca parametry boolean - może być override
//        jeśli true wtedy przypisanie (switch case) w zależności od składnika co ile kosztuje, superklasa i podklasy przypisują do swoich zmiennych, następnie te zmienne są przekazywane jako parametry do metod override
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }
}
