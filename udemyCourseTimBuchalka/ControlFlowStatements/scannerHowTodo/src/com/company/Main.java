package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something:");
        String sth = scanner.nextLine();
        System.out.println("Your something is: " + sth);

    }
}
