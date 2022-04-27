public class OuterClass {

    int number = 7;

    public void heyThere(){
        System.out.println("Hey there form outer class");
    }

//    Inner class:
    public class innerClass{
        int number = 5;

        public void whatsUp(){
            System.out.println("What's up form inner class");

//            Local inner class: (inside a method)
            class localInnerClass{
                String local = "Hello from LOCAL inner class";

                public void printLocal(){
                    System.out.println(local);
                }
            }

            localInnerClass lic = new localInnerClass();//local inner class is available only in outer class
            lic.printLocal();
        }
    }

//    Inner static class
    public static class innerStaticClass{
        public void whatsUp(){
            System.out.println("What's up form STATIC inner class");
        }
    }
}
