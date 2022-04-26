package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int beginNumber = number;

        while (number != 0){
            reverse += number % 10;
            reverse *= 10;
            number /= 10;
        }
        reverse /= 10;


        System.out.println(reverse);
        System.out.println(beginNumber);

        if (beginNumber == reverse){
            return true;
        }

        else {
            return false;
        }
    }
}
