public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int seccond){
        int divisor = 0;
        if (first < 10 || seccond < 10){
            return -1;
        } else {
            int smaller = 0;
            int bigger = 0;

            if (first < seccond){
                smaller = first;
                bigger = seccond;
            } else {
                smaller = seccond;
                bigger = first;
            }

            for (int count = 1; count <= smaller; count++){
                if (smaller % count == 0){
                    if (bigger % count == 0){
                        divisor = count;
                    }
                }
            }
        }
        return divisor;
    }
}
