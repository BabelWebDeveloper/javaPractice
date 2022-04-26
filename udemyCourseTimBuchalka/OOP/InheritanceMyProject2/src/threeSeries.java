public class threeSeries extends Car{
    private int carMileage;//unikalna cecha dla tego konkretnego auta - przebieg

    public threeSeries(int carMileage) {
        super("BMW","diesel",2,"sedan",4,4,5,2.0,false);//deklaracja parametrów odpowiadających temu modelowi auta
        this.carMileage = carMileage;//zmienna przebieg odpowiadająca już konktretnemu samochodowi
    }

    public void changeSpeed(int accelerate) {
        int newVelocity = getVelocity() + accelerate;//obliczenie nowej prędkości pojazdu
        if (newVelocity > 0 && newVelocity <= 30) {//deklaracja warunków dla zmiany biegów
            changeGear(1);//wywołanie funkcji zmiany biegu i przekazanie parametru do Car.java
        } else if (newVelocity > 30 && newVelocity <= 50) {
            changeGear(2);
        }

        changeVelocity(newVelocity,getDirection());//wywołanie funkcji zmiany prędkości i przekazanie obliczonych parametrów do Car.java
//        move(newVelocity,getDirection());//to co wyżej ale ominięcie funkcji w Car.java
    }

    public void changeDirection(int angleOfRoad) {
//        some conditions to change direction
        steer(angleOfRoad);
        changeVelocity(getVelocity(),getDirection());
    }

    public int getCarMileage() {
        return carMileage;
    }
}
