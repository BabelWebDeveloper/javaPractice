public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {// w tym miejscu zadeklarowane ekstra cech dla psów które nie muszą występować u wszystkich zwierząt - importowane z dog.java
        super(name, 1, 1, size, weight);//w tym miejscu standardowe cechy dla wszystkic zwierząt - importowane z animal.java
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override//nadpisanie metody eat z animals i przypisanie do niej sposobu/metody specyficznej dla danego zwierzęcia - tutaj chew
    public void eat() {
        System.out.println("Dog.eat() called");
        System.out.println();
        chew();//przypisanie metody chew - jako sposób spożywania posiłków do animal eat
        super.eat();/*wywołanie metody eat "ogólnej" - dla wszystkich zwierząt*/
    }

}
