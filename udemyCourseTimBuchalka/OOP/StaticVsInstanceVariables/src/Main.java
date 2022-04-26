public class Main {
    public static void main(String[] args) {

//        STATIC VARIABLES:
        Dog rex = new Dog("rex");
        Dog fluffy = new Dog("fluffy");

        rex.printName();
        fluffy.printName();
//        jako że zmienna została zadeklarowana jako static, ostatnia zmiana jej wartości przez konstruktor Dog sprawi że zmienna name zostanie nadpisana mimo że znajduje się w dwóch róznych obiektach

//        INSTANCE VARIABLES:
        DogInstance reksio = new DogInstance("reksio");
        DogInstance pluto = new DogInstance("pluto");
        reksio.printName();
        pluto.printName();
//        zmienne zadeklarowane jako instance (bez static keyword) zmienna zostaje przypisywana do każdego obiektu jako inna i możne je zmieniać
    }
}
