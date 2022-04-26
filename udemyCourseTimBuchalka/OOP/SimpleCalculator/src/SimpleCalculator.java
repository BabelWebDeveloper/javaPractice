public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

//    setters:
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

//    getters:
    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

//    addition:
    public double getAdditionResult() {
        return getFirstNumber() + getSecondNumber();
    }

//    subtraction:
    public double getSubtractionResult() {
        return getFirstNumber() - getSecondNumber();
    }

//    multiplication
    public double getMultiplicationResult() {
        return getFirstNumber() * getSecondNumber();
    }

//    division
    public double getDivisionResult() {
        if (getSecondNumber() == 0) {
            return 0;
        } else {
            return getFirstNumber() / getSecondNumber();
        }
    }
}
