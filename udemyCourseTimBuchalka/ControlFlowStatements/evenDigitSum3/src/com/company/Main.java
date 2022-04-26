package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number){

        if (number <= 0){
            return -1;
        }

        else {

            int lastDigit = 0;
            int sum = 0;

            while (number > 0){
                lastDigit = number % 10;
                if (lastDigit % 2 == 0){
                    sum += lastDigit;
                }
                number /= 10;
            }

            return sum;
        }
    }
}
