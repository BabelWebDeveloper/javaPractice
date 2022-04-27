public class Main {
    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);//gearBox declaration
        mcLaren.addGear(1,12.3);
        mcLaren.addGear(2,17.5);
        mcLaren.addGear(3,21.8);

        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);

        System.out.println(mcLaren.wheelSpeed(1000));

        mcLaren.operateClutch(true);
        mcLaren.changeGear(2);
        mcLaren.operateClutch(false);

        System.out.println(mcLaren.wheelSpeed(1000));
    }
}
