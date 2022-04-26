package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printFactors(32);
    }

    public static void printFactors(int number){

        if (number < 1){
            System.out.println("Invalid Value");
        }

        else {
            int r = 1;
            int factors = 0;

            while (r <= number){
                if (number % r == 0){
                    System.out.println(r);
                }
                r++;
            }
        }
    }
}
