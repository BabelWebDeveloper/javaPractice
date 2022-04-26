public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        } else {
            int bigTotal = 5 * bigCount;

            if (bigTotal + smallCount == goal){
                return true;

            } else {
                while (bigTotal > goal){
                    bigTotal -= 5;
                    if (bigTotal + smallCount == goal){
                        return true;
                    }
                }
                while (smallCount >= 0){
                    smallCount--;
                    if (bigTotal + smallCount == goal){
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
