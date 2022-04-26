package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumFirstAndLastDigit(56));
        ;
    }

    public static int sumFirstAndLastDigit(int number){

        if (number < 0){
            return -1;
        }

        else {

//            LastDigit
            int lastDigit = number % 10;

//            First number
            int firstDigit = 0;
            while (number > 0){
                firstDigit = number;
                number /= 10;
            }

            return firstDigit + lastDigit;
        }

    }
}
