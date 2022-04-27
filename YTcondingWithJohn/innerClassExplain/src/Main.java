public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.heyThere();

//        Regular inner class:
        OuterClass.innerClass inner = outer.new innerClass();
        inner.whatsUp();

//        Static inner class: (we can create inner class by itself - don't required outer class)
        OuterClass.innerStaticClass innerStatic = new OuterClass.innerStaticClass();
        innerStatic.whatsUp();


    }
}
