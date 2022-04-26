public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("class",23,true);

        System.out.println("This is superclass:");
        superClass.test1("test1");
//        superClass.test1("test2","test2");

        System.out.println();
        subClass subClass = new subClass("class",23,true);
        subClass.test1("test1subclass","test2","test3");
    }
}
