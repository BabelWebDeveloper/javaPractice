public class PC {
    private Case theCase;//zmienne instancji jako obiekty (duża litera) które muszą być zdefiniowane
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    //gettersy nie są konieczne możemy odrazu użyć zmiennych:
    public void powerUp(){
        getTheCase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200,50,"Yellow");
    }


    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard()  {
        return motherboard;
    }
}
