public class Main {
    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber number = new ComplexNumber(2.5,-1.5);
        one.add(1,1);
        System.out.println("one real= " + one.getReal());
        System.out.println("one imaginary= " + one.getImaginary());

//        ComplexNumber two = new ComplexNumber(2.5,-1.5);
//        ComplexNumber three = new ComplexNumber(2.5,1.5);
//        two.add(three);
//        System.out.println("two real: " + two.getReal());
//        System.out.println("two imaginary: " + two.getImaginary());

        one.subtract(number);
        System.out.println("one real= " + one.getReal());
        System.out.println("one imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number real= " + number.getReal());
        System.out.println("number imaginary= " + number.getImaginary());
    }
}
