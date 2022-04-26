public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real += real;//this.real odnosi się do obiektu do którego przypisana będzie metoda, real pochodzi z zadanego parametru
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber number){
        this.real += number.getReal();//pobranie wartości getterem z zadanego parametru
        this.imaginary += number.getImaginary();
    }

    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber number){
        this.real -= number.getReal();
        this.imaginary -= number.getImaginary();
    }
}
