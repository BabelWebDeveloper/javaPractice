package com.company;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2022";
        System.out.println("Number as string: " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        number++;
        System.out.println("New number = " + number);

        double doubleNumber = Double.parseDouble(numberAsString);
        System.out.println(doubleNumber);

        String newDoubleAsString = "2022.22";
        double number2 = Double.parseDouble(newDoubleAsString);/*nie można zrobić konwersji na int jeśli w stringu mamy liczbę po przecinku - wtedy tylko na double i potem z double na int*/
        System.out.println(number2);
        int number2Int = (int) number2;
        System.out.println(number2Int);
    }
}
