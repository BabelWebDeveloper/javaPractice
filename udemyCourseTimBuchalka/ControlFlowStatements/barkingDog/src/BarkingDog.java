public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (0 <= hourOfDay && hourOfDay <= 23) {
            if (barking == true && 22 < hourOfDay) {
                return true;
            } else if (barking == true && hourOfDay < 8) {
                return true;
            }
            return false;
        } return false;
    }
}
