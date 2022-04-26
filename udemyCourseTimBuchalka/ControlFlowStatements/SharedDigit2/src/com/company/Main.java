package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasSharedDigit(12,23));
    }

    public static boolean hasSharedDigit(int number1, int number2){

        int lastDigit1 = 0;
        int lastDigi2 = 0;
        int value = number2;

        if ((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)){
            while (number1 > 10){
                lastDigit1 = number1 % 10;
                if (lastDigi2 == number2){
                    return true;
                } else {
                    number2 /= 10;
                }
            }
            do {
                lastDigi2 = number2 % 10;
            } while (number2 > 0);

//            number2 = value;
//            number1 /= 10;
        }
        return false;


    }
}
