public class Room {
    private String name;
    private Dimensions dimensions;
    private Lighting light;
    private Windows windows;
    private Door door;

    public Room(String name, Dimensions dimensions, Lighting light, Windows windows, Door door) {
        this.name = name;
        this.dimensions = dimensions;
        this.light = light;
        this.windows = windows;
        this.door = door;
    }

    public void close(boolean windows, boolean closeDoor){
        System.out.println("Room close() called ---");
        getWindows().openCloseWindow(windows);
        getWindows().getWindowBlinds().openCloseBlinds(windows);
        door(closeDoor);
    }

    private void door(boolean access){
        door.isAccess(access);
    }

    public String getName() {
        return name;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Lighting getLight() {
        return light;
    }

    private Windows getWindows() {
        return windows;
    }

    private Door getDoor() {
        return door;
    }
}
