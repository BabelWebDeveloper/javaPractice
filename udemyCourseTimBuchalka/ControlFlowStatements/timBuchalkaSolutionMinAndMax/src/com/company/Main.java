package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;

        boolean first = true;

        while (true) {

            System.out.println("Enter number:");
            boolean isInt = scanner.hasNextInt();

            if (isInt){

                int number = scanner.nextInt();

                if (first) {/*ta czynność pozwala zapisać wartość number do max i min bez straty tych wartości przy następnym councie - wartość flagi zmeinia się na false*/
                    first = false;
                    max = number;
                    min = number;
                }

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }

            }

            else {
                System.out.println("Min: " + min + ", max: " + max);
                scanner.close();
                break;
            }
        }
    }
}
