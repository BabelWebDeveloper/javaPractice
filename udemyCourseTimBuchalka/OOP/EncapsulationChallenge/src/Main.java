public class Main {
    public static void main(String[] args) {
        Printer canon = new Printer("Canon",35);//visible name, but it is brand

        canon.printPage(10,true);
        System.out.println(canon.getName());//real name of variable is hidden by giving different name to getter
    }
}
