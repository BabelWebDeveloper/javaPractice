package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(FirstLastDigitSum(555));
    }

    public static int FirstLastDigitSum(int number){

        if (number < 0){
            return -1;
        }

        else {
            int lastNumber = number % 10;
            int firstNumber = 0;

            while (number > 0){
                firstNumber = number;
                number /= 10;
            }

            return lastNumber + firstNumber;
        }
    }
}
