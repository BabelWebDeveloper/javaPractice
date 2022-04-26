public class subClass extends SuperClass{
    public subClass(String string, int number, boolean booleans) {
        super(string, number, booleans);
    }

    @Override
    public void test1(String string1, String string2, String string3) {
        System.out.println("This is subclass:" + string3);//to jest wywoływane tylko jeśli w metodzie zgadza się liczba parametrów w main
//        String string3 = "rew";//tutaj możę być zdefiniowany limit = 6
        super.test1(string1,string2,string3);
    }
    public void test1(String string1, String string2, String string3, String string4){
//        System.out.println(string3);
        test1(string1, string2, string3);//tutaj przeliczone składniki podstawowe
        test1(string4);
    }

    public void test1(String string1, String string2, String string3, String string4, String string5){
        System.out.println(string3 + string4);
        test1(string1, string2, string3);
    }

}
//dwie opcje, najnowsza to zdefiniować limit tutaj, natomiast w superklasie zrobić metodę która wszystko przelicza uwzględniając zadklarowany limit oraz metodę która pobiera składnik i przekazuje go do meetody przeliczającej - wywołanie metody metodą

//druga opcja to zrobić 6 metod...wtf?