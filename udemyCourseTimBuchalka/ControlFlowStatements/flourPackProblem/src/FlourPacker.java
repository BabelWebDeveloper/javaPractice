public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        } else {

            int bigCountTotal = bigCount * 5;
            int total = bigCountTotal + smallCount;

            if (total == goal){
                return true;
            } else if (bigCountTotal % goal != 0){
                while (bigCountTotal > goal) {
                    bigCountTotal -= 5;
                }
            }

            int smallValue = goal - bigCountTotal;
            if (smallCount >= smallValue){
//                System.out.println(bigCountTotal);
//                System.out.println(smallCount);
                return true;
            }
            return false;
        }

    }
}
