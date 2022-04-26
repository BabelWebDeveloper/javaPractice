public class Carpet {
    private double cost;

    public Carpet(double cost) {
        if (cost < 0){
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    //    musi zostać tylko jedna metoda - getArea
//    getters & setters:
    public double getCost() {
        return cost;
    }
}
