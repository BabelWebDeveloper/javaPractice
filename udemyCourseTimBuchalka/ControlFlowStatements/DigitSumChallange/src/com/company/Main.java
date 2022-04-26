package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(3255));
    }

    public static int sumDigits(int number){
        if (number >= 10){
            int sum = 0;
            while (number != 0){
                sum += number % 10;
                number /= 10;
                System.out.println("Sum: " + sum);
                System.out.println("Number: " + number);
            }
            return sum;
        } else {
            return -1;
        }
    }
}

//package com.company;
//
//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println(sumDigits(2255));
//    }
//
//    public static int sumDigits(int number){
//        if (number >= 10){
//            int sum = 0;
//            while (number != 0){
//                sum += number % 10;
//                number /= 10;
//                System.out.println("Sum: " + sum);
//                System.out.println("Number: " + number);
//            }
//            return sum;
//        } else {
//            return -1;
//        }
//    }
//}
//
