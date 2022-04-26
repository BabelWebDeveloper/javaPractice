public class NumberToWords {
    public static void numberToWords(int number){

        int digit = 0;
        int numberCount = getDigitCount(number);
        number = reverse(number);

        if (number < 0){
            System.out.println("Invalid Value");
        } else {

            for (int i = 1; i <= numberCount; i++){

                digit = number % 10;
                number /= 10;

                switch (digit){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Not a number?");
                        break;
                }
            }
        }
    }

    public static int reverse(int number){
        int reverse = 0;
        while (number != 0){
            reverse += number % 10;
            reverse *= 10;
            number /= 10;
        }
        reverse /= 10;
        return reverse;
    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        } else {
            if (number == 0){
                return 1;
            } else {
                int count = 0;
                while (number > 0){
                    count++;
                    number /= 10;
                }
                return count;
            }
        }
    }
}
