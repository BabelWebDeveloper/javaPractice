package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner scanner = new Scanner(System.in);


        int maxNum = 0;
        int minNum = 0;

        int st = 0;

        int count = 0;

        while (true) {

            System.out.println("Enter number:");
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();
                count++;

                if (count == 1) {
                    st = number;

                } else if (count == 2) {

                    if (st > number) {
                        maxNum = st;
                        minNum = number;
                    } else {
                        maxNum = number;
                        minNum = st;
                    }

                } else {
                    if (number > maxNum) {
                        maxNum = number;
                    } else if (number < minNum) {
                        minNum = number;
                    }

                }
            } else {
                System.out.println("Max: " + maxNum + " and min: " + minNum);
                scanner.close();
                break;
            }
        }

    }
}
