public class getLargestPrime {
    public static int getLargestPrime (int num){
        if (num <= 1){
            return -1;
        }
        else {

            int prime = 0;
            int rem = num;

            while (rem >= 1){

                if (num % rem == 0) {

                    int rem2 = rem;
                    int count = 0;

                    while (rem2 >= 1) {
                        if (rem % rem2 == 0) {
                            count++;
                        }
                        rem2--;
                    }

                    if (count == 2){
                        prime = rem;
                        break;
                    }

                }
                rem--;
            }

            return prime;
        }
    }
}
