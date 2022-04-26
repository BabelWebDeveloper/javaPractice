package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.println("Enter number " + count);
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt){
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                sum += 0;
                System.out.println("Invalid value.");
            }

            scanner.nextLine();
        }

        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
