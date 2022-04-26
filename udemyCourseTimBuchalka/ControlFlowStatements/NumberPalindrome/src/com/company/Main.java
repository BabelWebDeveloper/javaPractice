package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int number){

        int remainder = 0;
        int initialNumber = number;

        while (number != 0){
            remainder += number % 10;
            remainder *= 10;

            number /= 10;
        }
        remainder /= 10;

        if (remainder == initialNumber){
            return true;
        }
        else {
            return false;
        }

    }
}
