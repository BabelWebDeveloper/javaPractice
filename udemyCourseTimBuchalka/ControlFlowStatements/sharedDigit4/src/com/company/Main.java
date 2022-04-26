package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasSharedDigit(15,66));
    }

    public static boolean hasSharedDigit(int number1, int number2){

        if (number1 >= 10 && number2 >= 10 && number1 <= 99 && number2 <= 99){

            int num1 = number1;
            int num2 = number2;
            int r1 = 0;
            int r2 = 0;

            while (number1 > 0){

                r1 = number1 % 10;
                number2 = num2;

                while (number2 > 0){

                    r2 = number2 % 10;

                    if (r1 == r2){
                        return true;
                    }

                    number2 /= 10;

                }

                number1 /= 10;

            }
            return false;

        }

        else {
            return false;
        }
    }
}
