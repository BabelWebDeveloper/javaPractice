public class Kitchen extends Component {

//    lista dostępnych elementów do sterowania w kuchni jako fieldsy:
    private final Curtains curtains;
    private final FloorLamp floorLamp;

    public Kitchen() {
        this.curtains = new Curtains();
        this.floorLamp = new FloorLamp();
    }

    public Curtains getCurtains() {
        return curtains;
    }

    public FloorLamp getFloorLamp() {
        return floorLamp;
    }

//    Do sprawdzenia statusu elementów:
    public boolean curtainsOpen() {
        return curtains.isOpen();
    }

    public boolean floorLampOn() {
        return floorLamp.isLightOn();
    }

}