package com.company;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("  ");

//        Alternative while:
        count = 1;
        while (true){
            if (count == 6) {
                break;
            } else {
                System.out.println("alternative while is: " + count);
                count++;
            }
        }
//        DO while:
        System.out.println("  ");
        count = 1;
        do {
            System.out.println("Count value do while was: " + count);
            count++;
        } while (count != 6);

        System.out.println("  ");

//          Alternative version of for:
        for (count = 1; count != 6; count++){
            System.out.println("For value is " + count);
        }
    }
}
