public class Main {

    public static void main(String[] args) {
        Car porshe = new Car();
        Car bmw = new Car();

        porshe.setModel("911");/*SETTER*/
        System.out.println("Model is " + porshe.getModel());/*GETTER*/

    }
}