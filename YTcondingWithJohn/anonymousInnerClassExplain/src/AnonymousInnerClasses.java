public class AnonymousInnerClasses {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeNoise();

        Animal bigFoot = new Animal(){//this curly braces "define" or tell JVM that we create anonymous subclass in Animal class, this subclass doesn't have a name, so we can't instantiate another object of that class, except we implement interface in that same way instead of creating subclass
            @Override
            public void makeNoise() {
                System.out.println("Graww!!!");
            }
        };
        bigFoot.makeNoise();

        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("My runnable run.");
            }
        };
        myRunnable.run();
    }
}
