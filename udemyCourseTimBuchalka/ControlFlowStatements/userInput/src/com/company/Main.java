package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        boolean hasNextInt = scanner.hasNextInt();/*sprawdza czy następna wprowadzona wartość to liczba całkowita, jeśli jest zwraca true*/

        if (hasNextInt == true) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2022 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " and your age is: " + age);
            }
            else {
                System.out.println("Invalid year of birth.");
            }
        }
        else {
            System.out.println("Unable to pass year of birth");
        }

        scanner.close();
    }
}
