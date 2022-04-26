public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone;

//        both classes implement hte same interface
        timsPhone = new DeskPhone(123456789);
        timsPhone.powerOn();
        timsPhone.callPhone(123456789);
        timsPhone.answer();

        System.out.println();

        timsPhone = new MobilePhone(987654321);
//        timsPhone.powerOn();
        timsPhone.callPhone(987654321);
        timsPhone.answer();
    }
}
