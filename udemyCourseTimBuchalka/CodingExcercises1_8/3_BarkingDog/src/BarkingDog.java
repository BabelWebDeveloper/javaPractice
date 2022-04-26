public class BarkingDog {
    public static boolean shouldWakeUp(boolean braking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        } else {
            if (braking == true && (hourOfDay < 8 || hourOfDay > 22)){
                return true;
            } else {
                return false;
            }
        }
    }
}
