public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
            return false;
        } else {
            int initial2 = num2;
            int digitNum1 = 0;
            int digitNum2 = 0;

            while (num1 > 0){
                digitNum1 = num1 % 10;

                while (num2 > 0){
                    digitNum2 = num2 % 10;

                    if (digitNum1 == digitNum2){
                        return true;
                    }
                    num2 /= 10;
                }
                num2 = initial2;
                num1 /= 10;
            }
            return false;
        }
    }
}
