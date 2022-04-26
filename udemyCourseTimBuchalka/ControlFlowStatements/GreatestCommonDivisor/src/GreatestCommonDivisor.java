public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int num1, int num2){
        if (num1 < 10 || num2 < 10){
            return -1;
        } else {
            int firstNumber = num1;
            int seccondNumber = num2;

            while (firstNumber != seccondNumber){
                if (firstNumber > seccondNumber) {
                    firstNumber = firstNumber - seccondNumber;
                } else {
                    seccondNumber = seccondNumber - firstNumber;
                }
            }
            return firstNumber;
        }
    }
}

//            if (seccondNumber == 0) {
//                return firstNumber;
//            } else {
//                do {
//                    seccondNumber = firstNumber % seccondNumber;
//                    firstNumber = seccondNumber;
//                    seccondNumber = firstNumber;
//                } while (seccondNumber == 0);
//                return seccondNumber;
//            }
