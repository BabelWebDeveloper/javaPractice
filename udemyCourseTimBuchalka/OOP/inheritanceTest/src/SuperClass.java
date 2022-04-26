public class SuperClass {
    private String string;
    private int number;
    private boolean booleans;

    public SuperClass(String string, int number, boolean booleans) {
        this.string = string;
        this.number = number;
        this.booleans = booleans;
    }

    public void test1(String string1){
        System.out.println(string1);
    }

    public void test1(String string1, String string2){
        System.out.println(string1 + string2);
    }

    public void test1(String string1, String string2, String string3){
        System.out.println(string1 + string2 + string3);
    }

    public void counterClass(){
        System.out.println("Counter class");
    }

    public String getString() {
        return string;
    }

    public int getNumber() {
        return number;
    }

    public boolean isBooleans() {
        return booleans;
    }
}
