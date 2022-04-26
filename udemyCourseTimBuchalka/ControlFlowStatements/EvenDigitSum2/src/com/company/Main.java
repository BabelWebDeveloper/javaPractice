package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(EvenDigitSum(202222));
    }

    public static int EvenDigitSum(int number){

        int remainder = 0;

        while (number > 0){/*do momentu gdy number jest większy od zera*/
            if (number % 2 == 0){/*każdy numer który po podzieleniu przez 2 daje resztę zero (liczba parzysta)*/
                remainder += number % 10;/*dodajemy do remainder końcówkę numberu (reszta z dzielenia przez 10 zwraca ostatnią cyfrę)*/
            }
            number /=10;/*zmnijeszenie numeru, dobranie się do kolejnej liczby (od końca)*/
        }
        return remainder;
    }
}
