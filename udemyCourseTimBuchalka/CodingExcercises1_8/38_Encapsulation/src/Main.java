public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(2,false);
        printer.addToner(3);
        printer.printPages(6);
    }
}
