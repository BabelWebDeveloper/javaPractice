public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

//    musi zostać tylko jedna metoda - getArea
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
