public class Main {
    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//        Gearbox.Gear seccond = new Gearbox.Gear(2,15.4); // ERROR - when we change gear we have to get into interaction with the gearbox not directly with the gear
        System.out.println(first.driveSpeed(1000));
    }
}
