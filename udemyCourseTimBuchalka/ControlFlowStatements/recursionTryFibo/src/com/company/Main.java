package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }

    public static int fibonacci (long n){
        if (n <= 2){
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
//            trzeba to zrobić pętlą
        }
    }
}
